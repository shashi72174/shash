package com.package1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySimpleQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		sc.nextLine();
		int[] inputArr = new int[n];
		
		for(int j=0;j<n;j++) {
			inputArr[j] = sc.nextInt();
		}
		sc.nextLine();
		int[][] input = new int[q][3];
		for(int i=0;i<q;i++) {
			String[] str = sc.nextLine().split(" ");
			int[] inputrow = new int[str.length];
			for(int j=0;j<str.length;j++) {
				inputrow[j] = Integer.parseInt(str[j]);
			}
			input[i] = inputrow;
		}
		//System.out.println(Arrays.toString(input));
		
		System.out.println(arraySimpleQueries(inputArr,input));
		
		sc.close();
	}

	private static int[] arraySimpleQueries(int[] inputArr, int[][] input) {
		for(int i=0;i<input.length;i++) {
			int[] query = input[i];
			for(int j=0;j<query.length;j++) {
				switch(query[0]) {
				case 1:
				case 2;
				}
				
			}
		}
		return null;
		
	}

}
