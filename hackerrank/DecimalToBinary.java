package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimalNum = 15;
		decimalToBinary(decimalNum);
		
	}

	
	public static void decimalToBinary(int decimalNum) {
		String binaryVal = "";
		if(decimalNum==0);
			System.out.println("0");
		while(decimalNum!=0) {
			binaryVal = binaryVal + decimalNum%2;
			decimalNum = decimalNum/2;
		}
		char[] arr = binaryVal.toCharArray();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(Character.getNumericValue(arr[i]));
		}
		Collections.reverse(list);
		binaryVal = "";
		for(Integer val : list) {
			binaryVal = binaryVal+val;
		}
		System.out.println(binaryVal);
	}
}