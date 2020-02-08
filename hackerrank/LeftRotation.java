package com.learning;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5,d = 4;
		int[] arr = new int[] {1,2,3,4,5};
		
		int[] newArr = new int[n];
		int storeFirstVal = 0;
		while(d>=1) {
			for(int i=1;i<n;i++) 
				newArr[i-1] = arr[i];
			if(storeFirstVal==0)
				newArr[n-1] = arr[0];
			else
				newArr[n-1] = storeFirstVal;
			storeFirstVal = newArr[0];
			arr = newArr;
			d--;
		}
		for(Integer i : newArr) {
			System.out.print(i+" ");
		}
	}

}
