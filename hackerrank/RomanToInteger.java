package com.learning;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "MCMXCIV";
		int number = 0;
		Map<String,Integer> map = new HashMap<String,Integer>();	
		map.put("M", 1000);
		map.put("CM", 900);
		map.put("D", 500);
		map.put("CD", 400);
		map.put("C", 100);
		map.put("XC", 90);
		map.put("L", 50);
		map.put("XL", 40);
		map.put("X", 10);
		map.put("IX", 9);
		map.put("V", 5);
		map.put("IV", 4);
		map.put("I", 1);
		
		/*for(int i=0;i<s.length();i++) {
			number = number + map.get(Character.toString(s.charAt(i)));
			
		}*/
		int i=0;
		while(s.length()>0) {
			if(s.length()==1) {
				number = number + map.get(""+s.charAt(0));
				break;
			}else if(map.get(""+s.charAt(i)) < map.get(""+s.charAt(i+1))) {
				number = number + map.get(""+s.charAt(i)+s.charAt(i+1));
				s = s.substring(i+2);
			}else if(map.get(""+s.charAt(i)) >= map.get(""+s.charAt(i+1))) {
				number = number + map.get(""+s.charAt(i));
				s = s.substring(i+1);
			}
		}
		System.out.println(number);
	}

}
