package com.learning;

public class Romanizer {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		int number = 9654;
		String res = "";
		while(number>0) {
			if(number>=1000) {
				number = number - 1000;
				res = res+"M";
			}else if(number>=900) {
				number = number - 900;
				res = res + "CM";
			}else if(number>=500) {
				number = number - 500;
				res = res + "D";
			}else if(number>=400) {
				number = number - 400;
				res = res + "CD";
			}else if(number>=100) {
				number = number - 100;
				res = res + "C";
			}else if(number>=90) {
				number = number - 90;
				res = res + "XC";
			}else if(number>=50) {
				number = number - 50;
				res = res + "L";
			}else if(number>=40) {
				number = number - 40;
				res = res + "XL";
			}else if(number>=10) {
				number = number - 10;
				res = res + "X";
			}else if(number>=9) {
				number = number - 9;
				res = res + "IX";
			}else if(number>=5) {
				number = number - 5;
				res = res + "V";
			}else if(number>=4) {
				number = number - 4;
				res = res + "IV";
			}else if(number>=1) {
				number = number - 1;
				res = res + "I";
			}
		}
		System.out.println(res);
		System.out.println(System.currentTimeMillis());
	}
}