package com.test.client2;

public class LongestNonRepeatableSubString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "GEEKSFORGEEKS";
		String str = "ABDEFGABEF";
		String nonRepeatable = "";
		for(int i = 0;i<str.length();i++) {
			if(!nonRepeatable.contains(""+str.charAt(i)))
				nonRepeatable = nonRepeatable+str.charAt(i);
			else {
				if(nonRepeatable.length()<(str.length()/2))
					nonRepeatable = "";
			}		
		}
		System.out.println(nonRepeatable);
	}

}
