package com.test.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		
		int subSequenceCount = 0;
		int arrayElement = -1;
		int index = -1;
		String seq = "";
		for(int i=0;i<arr.length;i++) {
			if(list.subList(list.indexOf(arr[i]), list.size()).size()>((list.size()/2))) {
				subSequenceCount++;
				arrayElement = arr[i];
				index = i;
				seq = seq + arrayElement;
				break;
			}
		}
		index++;
		while(index < (arr.length)) {
			if(arr[index]>arrayElement) {
				subSequenceCount++;
				arrayElement = arr[index];
				seq = seq + " " + arrayElement;
			}
			index++;
		}
		System.out.println(subSequenceCount);
		System.out.println(seq);
	}

}
