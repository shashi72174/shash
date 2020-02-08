package com.test;

public class IsomorphicTest {
	public static void main(String[] args) {
		String s1 = "egg";
		String s2 = "aff";
		if(s1.length() == s2.length())
			System.out.println(isIsomorphic(s1, s2) ? "Isomorphic": "Not Isomorphic");
		else
			System.out.println("Not Isomorphic");
	}
	
	public static boolean isIsomorphic(String s1, String s2) {
		boolean flag = true;
		for(int i=0;i<s1.length();i++) {
			int index = s1.indexOf(s1.charAt(i));
			if(index!=i) {
				if(s2.charAt(i)!=s2.charAt(index)) {
					flag = false;
					break;
				}
			}
		}
		
		for(int i=0;i<s2.length();i++) {
			int index = s2.indexOf(s2.charAt(i));
			if(index!=i) {
				if(s1.charAt(i)!=s1.charAt(index)) {
					flag = false;
					break;
				}
			}
		}
		
		return flag;
	}
}