package com.test;

public class LongestNonRepeatingSubString {

	public static void main(String[] args) {
		String s = "bbbbb";//anviaj
		System.out.println(longestNonRepeatingSubString(s));
	}

	private static int longestNonRepeatingSubString(String s) {
		String prev = "";
		String current = "";
		for(int i=0;i<s.length();i++) {
			if(!current.contains(""+s.charAt(i))) {
				current = current + s.charAt(i);
			}else {
				if(current.length()>prev.length())
					prev = new String(current);
				current = current.substring(current.indexOf(s.charAt(i))+1)+s.charAt(i);
			}
		}
		return Math.max(current.length(), prev.length());
	}
}