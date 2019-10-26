import java.util.Arrays;

public class AlmostSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[] {1, 5, 4, 3, 2, 6};
		int[] arr = new int[] {3, 1, 2};
		//int[] arr = new int[] {4,2};
		almostSorted(arr);
	}
	
	// Complete the almostSorted function below.
    static void almostSorted(int[] arr) {
    	int[] unsorted = arr;
    	Arrays.sort(unsorted);
    	int i=0;
    	int startIndex = -1,endIndex = -1;
    	while(i<arr.length-1) {
    		if(arr.length==2 && arr[i]>arr[i+1]) {
    			startIndex = i;
    			endIndex = i+1;
    		}else if(arr[i]>arr[i+1] && startIndex == -1) {
    			startIndex = i;
    		}else if(startIndex != -1 && endIndex == -1 && arr[i]<arr[i+1]) {
    			endIndex = i;
    		}
    		i++;
    	}
    	System.out.println(startIndex+"\t"+endIndex);
    	//judge to swap or to reverse
    	if(startIndex+1 == endIndex) {
    		//swap index
    		int temp = 0;
    		temp = arr[startIndex];
    		arr[startIndex] = arr[endIndex];
    		arr[endIndex] = temp;
    		System.out.println("swap"+" "+(startIndex+1)+" "+(endIndex+1));
    	}else {
    		//reverse
    		int[] newArr = new int[arr.length];
    		int j=0;
    		int end = endIndex;
    		while(j<arr.length) {
    			if(j>=startIndex && j<=endIndex){
    				newArr[j] = arr[end];
    				end--;
    			}else {
    				newArr[j] = arr[j];
    			}
    			j++;
    		}
    		System.out.println("reverse"+" "+(startIndex+1)+" "+(endIndex+1));
    	}
    }

}
