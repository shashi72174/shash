package com.hackerrank;

public class LongestPositiveSequenceFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		int[] numbers = new int[] {1,2,-3,2,3,4,-6,1,2,3,4,5,-8,5,6,7,1,2,9,3,4,8,-1};
		int index = -1,count = 0,mainCount = 0,mainIndex = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>=0){
				if(index==-1) {
					index=i+1;
				}
				count++;
			}else {
				if(count>mainCount) {
					mainCount=count;
					mainIndex = index;
				}
				count = 0;
				index = -1;
			}
			
		}
		
		System.out.println(mainCount+"\t"+mainIndex);
		System.out.println(System.currentTimeMillis());
	}

}
