package com.test.client;

import java.util.Scanner;

public class DigitOccuranceInFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		String str = new Double((double)a/b).toString();
		str = str.substring(str.indexOf(".")+1);
		int pos = -1;
		for(int i = 0;i<str.length();i++) {
			if(Character.getNumericValue(str.charAt(i)) == c){
				pos = i+1;
				break;
			}
		}
		
		System.out.println(pos);
		sc.close();
		
	}

}
