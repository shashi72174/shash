package com.learning;

import java.util.Arrays;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = new String[] {"def","de","fgh"};
		String[] queries = new String[] {"de","lmn","fgh"};
		
		System.out.println(Arrays.toString(matchingStrings(strings, queries)));
	}
	
	// Complete the matchingStrings function below.
    private static int[] matchingStrings(String[] strings, String[] queries) {
    	int[] res = new int[queries.length];
    	for(int i=0;i<queries.length;i++) {
    		int count = 0;
    		for (int j=0;j<strings.length;j++) {
    			if(strings[j].equals(queries[i]))
    				count++;
    		}
    		res[i] = count;
    	}
    	return res;
    }

}
