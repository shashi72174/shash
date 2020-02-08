package com.learning;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AlmostSorted2 {

	public static void main(String[] args) throws Exception {
		int[] arr = new int[] { 1, 5, 4, 3, 2, 6 };
		// int[] arr = new int[] {3, 1, 2};
		// int[] arr = new int[] {4,2};
		// int[] arr = new int[] {1,2,3,4,8,6,7,5,9};
		// int[] arr = new int[] {2,3,5,4};
		// int[] arr = new int[] {1, 2, 4, 3, 5, 6};
		// int[] arr = new int[] {1, 2, 3, 5, 4, 6};

		/*
		 * BufferedReader br = new BufferedReader(new FileReader(new
		 * File("C:\\Users\\shash\\input.txt"))); String[] arrItems =
		 * br.readLine().split(" "); int[] arr = new int[arrItems.length]; for (int i =
		 * 0; i < arrItems.length; i++) { int arrItem = Integer.parseInt(arrItems[i]);
		 * arr[i] = arrItem; }
		 */
		System.out.println("fdsjfdsk"+"\t"+"fsdjfklsdjf");
		almostSorted(arr);
		// br.close();
	}

	static void almostSorted(int[] arr) {
		int i = 0;
		int startIndex = -1, endIndex = -1;
		boolean isSwap = false, isReverse = false, isSkip = false;
		int[] unsorted = new int[arr.length];

		if (arr.length == 2) {
			startIndex = i;
			endIndex = i + 1;
			isSwap = true;
		}

		while (i < arr.length - 1 && arr.length > 2) {

			if (startIndex == -1 && arr[i] > arr[i + 1]) {
				startIndex = i;
				i++;
				if (i == (arr.length - 1)) {
					endIndex = i;
					isSwap = true;
				}
				continue;
			} else if (arr[i] > arr[i + 1] && startIndex != -1) {
				endIndex = i + 1;
				if (isSkip)
					isSwap = true;
				else
					isReverse = true;
			} else if (arr[i] < arr[i + 1] && startIndex != -1) {
				if (endIndex != -1) {
					i++;
					continue;
				} else if (!isSwap && !isReverse && !isSkip && endIndex == -1) {
					endIndex = i;
					isSwap = true;
					isSkip = true;
				} else {
					i++;
					if (!isReverse)
						isSkip = true;
					continue;
				}
			}
			i++;
		}

		if (startIndex == -1 && endIndex == -1)
			System.out.println("no");
		else if (startIndex != -1 && endIndex == -1)
			System.out.println("no");
		else if (isSwap && !isReverse) {
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
		} else if (!isSwap && isReverse) {
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