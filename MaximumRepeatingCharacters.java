package com.test;

import java.util.ArrayList;
import java.util.List;

public class MaximumRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbcbbbbbc";
		List<String> l = new ArrayList<String>();
		int count = 0;
		char firstChar = '\u0000';
		for(int i=0;i<str.length();i++) {  
			if(i==0){
				firstChar=str.charAt(i);
				count++;
			}
			else if(i==(str.length()-1)) {
				l.add(str.charAt(i-1)+"-"+count);
				firstChar=str.charAt(i);
				if(firstChar!=str.charAt(i-1)){
					count=1;
					l.add(firstChar+"-"+count);
				}
			}
			else {
				if(firstChar==str.charAt(i)) 
					count++;
				else {
					l.add(str.charAt(i-1)+"-"+count);
					firstChar=str.charAt(i);
					count = 1;
				}
			}
		}
		
		int big=0;
		char biggestChar='\u0000';
		for(String s:l) {
			int val = Integer.parseInt(s.substring(2));
			if(val>big){
				biggestChar = s.charAt(0);
				big=val;
			}
		}
		System.out.println("biggest char ==== "+biggestChar+" number of characters === "+big);
		
		/*for(int i=0;;i++) {
			System.out.println(i);
		}*/
		
	}
	
	/*public static void main(String ... objects) {
		System.out.println("hi");
	}*/

}
