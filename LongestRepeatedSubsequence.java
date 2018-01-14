package com.test.client;

public class LongestRepeatedSubsequence {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = "AABEBCDD";
		StringBuilder sb = new StringBuilder("");
		String res = "";
		for(int i=0;i<str.length();i++) {
			if(sb.indexOf(""+str.charAt(i)) == -1)
				sb.append(""+str.charAt(i));
			else 
				res = res+str.charAt(i);
		}
		System.out.println(res);
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}
}