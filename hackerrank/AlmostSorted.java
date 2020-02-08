package com.learning;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class AlmostSorted {

	public static void main(String[] args) throws Exception {
		//int[] arr = new int[] { 1, 5, 4, 3, 2, 6 };
		//int[] arr = new int[] {3, 1, 2};
		//int[] arr = new int[] {4,2};
		int[] arr = new int[] {1,2,3,4,8,6,7,5,9};

		/*
		 * BufferedReader br = new BufferedReader(new FileReader(new
		 * File("C:\\Users\\shash\\input.txt"))); String[] arrItems =
		 * br.readLine().split(" "); int[] arr = new int[arrItems.length]; for (int i =
		 * 0; i < arrItems.length; i++) { int arrItem = Integer.parseInt(arrItems[i]);
		 * arr[i] = arrItem; }
		 */

		almostSorted(arr);
		//br.close();
	}

	static void almostSorted(int[] arr) {
		int i = 0;
		boolean isSwap = false;
		int[] unsorted = new int[arr.length];
		int startIndex = -1, endIndex = -1;

		while (i < arr.length - 1) {
			if (arr.length == 2 && arr[i] > arr[i + 1]) {
				startIndex = i;
				endIndex = i + 1;
				isSwap = true;
			} else if (arr[i] > arr[i + 1] && startIndex == -1) {
				startIndex = i;
			} else if (startIndex != -1 && arr[i + 1] > arr[i] && !isSwap && endIndex == -1) {
				isSwap = true;
				endIndex = i;
			} else if (startIndex != -1 && arr[i] < arr[i + 1]) {
				isSwap = false;
				endIndex = i;
			} 
			i++;
		}

		/*
		 * while (i < arr.length - 1) { if (arr.length == 2 && arr[i] > arr[i + 1]) {
		 * startIndex = i; endIndex = i + 1; } else if (arr[i] > arr[i + 1] &&
		 * startIndex == -1) startIndex = i; else if (startIndex != -1 && endIndex == -1
		 * && arr[i] < arr[i + 1]) endIndex = i;
		 * 
		 * i++; }
		 */

		if (startIndex == -1 && endIndex == -1) {
			System.out.println("no");
		} else if (startIndex + 1 == endIndex) {
			int temp = 0;
			temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			System.arraycopy(arr, 0, unsorted, 0, arr.length);
			Arrays.sort(unsorted);
			if (Arrays.equals(unsorted, arr)) {
				System.out.println("yes");
				System.out.println("swap" + " " + (startIndex + 1) + " " + (endIndex + 1));
			} else {
				System.out.println("no");
			}

		} else {
			int[] newArr = new int[arr.length];
			int j = 0;
			int end = endIndex;
			while (j < arr.length) {
				if (j >= startIndex && j <= endIndex) {
					newArr[j] = arr[end];
					end--;
				} else {
					newArr[j] = arr[j];
				}
				j++;
			}
			System.arraycopy(arr, 0, unsorted, 0, arr.length);
			Arrays.sort(unsorted);
			if (Arrays.equals(unsorted, newArr)) {
				System.out.println("yes");
				System.out.println("reverse" + " " + (startIndex + 1) + " " + (endIndex + 1));
			} else {
				System.out.println("no");
			}
		}
	}
}