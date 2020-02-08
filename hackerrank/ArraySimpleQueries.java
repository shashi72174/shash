package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraySimpleQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		sc.nextLine();
		int[] inputArr = new int[n];

		for (int j = 0; j < n; j++) {
			inputArr[j] = sc.nextInt();
		}
		sc.nextLine();
		int[][] input = new int[q][3];
		for (int i = 0; i < q; i++) {
			String[] str = sc.nextLine().split(" ");
			int[] inputrow = new int[str.length];
			for (int j = 0; j < str.length; j++) {
				inputrow[j] = Integer.parseInt(str[j]);
			}
			input[i] = inputrow;
		}
		// System.out.println(Arrays.toString(input));

		arraySimpleQueries(inputArr, input);

		sc.close();
	}

	private static List getSliceOfArray(int[] arr, int start, int end) {
		List res = new ArrayList();
		// Get the slice of the Array 
		int[] slice = new int[end - start];
		int[] remainingArr = new int[arr.length-(end-start)];
		// Copy elements of arr to slice 
		for (int i = 0; i < slice.length; i++) {
			slice[i] = arr[start + i];
		}
		int j = 0,k=0;
		while(j<=(start-1)) {
			remainingArr[k] = arr[j];
			j++;
			k++;
		}
		j=end;
		while(j>=end && j<arr.length) {
			remainingArr[k] = arr[j];
			k++;
			j++;
		}
		res.add(slice);
		res.add(remainingArr);
		return res;
	}

	private static void arraySimpleQueries(int[] inputArr, int[][] input) {
		int[] copy = new int[inputArr.length];
		int[] newArr = null;
		for (int i = 0; i < input.length; i++) {
			newArr = new int[inputArr.length];
			newArr = copy;
			int[] query = input[i];
			List slicedArray = getSliceOfArray(i==0 ? inputArr:newArr,query[1]-1,query[2]);
			switch (query[0]) {
			case 1:
				// remove elements and add to front of an array
		        System.arraycopy(slicedArray.get(0), 0, newArr, 0, ((int[])slicedArray.get(0)).length);
		        System.arraycopy(slicedArray.get(1), 0, newArr, ((int[])slicedArray.get(0)).length, ((int[])slicedArray.get(1)).length);
		        copy = newArr;
				break;
			case 2:
				// remove elements and add to back of an array
				System.arraycopy(slicedArray.get(1), 0, newArr, 0, ((int[])slicedArray.get(1)).length);
				System.arraycopy(slicedArray.get(0), 0, newArr, ((int[])slicedArray.get(1)).length, ((int[])slicedArray.get(0)).length);
				copy = newArr;
				break;
			}
			
		}
		System.out.println(Math.abs(newArr[0]-newArr[inputArr.length-1]));
		System.out.println(Arrays.toString(newArr).replace(",", "").replace("[", "").replace("]", ""));
	}

}
