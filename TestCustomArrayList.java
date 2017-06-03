package com.hackerrank;

public class TestCustomArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		CustomArrayList customArrayList = new CustomArrayList();
		customArrayList.add("A");
		customArrayList.add("B");
		customArrayList.add("C");
		customArrayList.add("D");
		customArrayList.add("E");
		for(int i=0;i<customArrayList.size();i++) {
			System.out.println(customArrayList.get(i));
		}
		System.out.println("=========================================="); 
		customArrayList.add("F");
		for(int i=0;i<customArrayList.size();i++) {
			System.out.println(customArrayList.get(i));
		}
		System.out.println(System.currentTimeMillis());
	}

}
