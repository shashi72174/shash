package com.test.client;

public class SearchValueIndexInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedArray = { 5, 6, 8, 9 };
		int index = 0;
		int searchValue = 4;

		for (int i = 0; i < sortedArray.length; i++) {
			if (sortedArray[i] < searchValue && i < (sortedArray.length - 1))
				index = index + 1;
			else if (i == (sortedArray.length - 1)) {
				index = sortedArray.length + 1;
				break;
			} else {
				index = index + 1;
				break;
			}
		}

		System.out.println(index);
	}

}
