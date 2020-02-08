package com.learning;

public class ArrayManipulation {

	public static void main(String[] args) {
		int n = 5;
		int[][] opr = new int[][] { {1,2,100}, {2,5,100}, {3,4,100} };
		System.out.println(arrayManipulation(n, opr));
	}
	
	static long arrayManipulation(int n, int[][] queries) {
		long[] arr = new long[n];
		for (int[] i : queries) {
			int  a = (i[0]-1),b = (i[1]-1), c = i[2];
			arr[a] += c;
		      if (b + 1 < n ) {
		        arr[b + 1] -= c;
		      }
		}
		
		long max = 0; long sum = 0;
	    for (int i = 0; i < n; i++) {
	      sum += arr[i];
	      max = Math.max(max, sum);
	    }

	    return max;
		
    }
	
	//good old approach
	
	/* Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n];
        for (int[] i : queries) {
            int  a = (i[0]-1),b = (i[1]-1), c = i[2];
            for(int j=a;j<=b;j++) 
                arr[j]=arr[j]+c;
        }
       // List<Long> listUsingJava8 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        * 
        * 
        * or
        *  
        long max = arr[0];
        for(long j : arr) {
            if(j>max) 
                max = j;
        }
        return max;
        return Collections.max(listUsingJava8);
    }*/
}