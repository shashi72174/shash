package com.test.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberToAlphabetConversion 
{
	Map<Integer,String> alphabets = new HashMap<Integer,String>();
		
	public NumberToAlphabetConversion() {
		alphabets.put(1,"A");
		alphabets.put(2,"B");
		alphabets.put(3,"C");
		alphabets.put(4,"D");
		alphabets.put(5,"E");
		alphabets.put(6,"F");
		alphabets.put(7,"G");
		alphabets.put(8,"H");
		alphabets.put(9,"I");
		alphabets.put(10,"J");
		alphabets.put(11,"K");
		alphabets.put(12,"L");
		alphabets.put(13,"M");
		alphabets.put(14,"N");
		alphabets.put(15,"O");
		alphabets.put(16,"P");
		alphabets.put(17,"Q");
		alphabets.put(18,"R");
		alphabets.put(19,"S");
		alphabets.put(20,"T");
		alphabets.put(21,"U");
		alphabets.put(22,"V");
		alphabets.put(23,"W");
		alphabets.put(24,"X");
		alphabets.put(25,"Y");
		alphabets.put(26,"Z");
		alphabets.put(0,"Z");
		
	}
    public static void main( String[] args )
    {
    	System.out.println(Integer.MAX_VALUE);
        System.out.println( "Hello World!" );
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        NumberToAlphabetConversion a = new NumberToAlphabetConversion();
        System.out.println(a.returnResult(num));
        sc.close();
    }
	private String returnResult(int num) {
		String retVal="";
		if(num<27)
        	return alphabets.get(num);
		else {
			int rem = num%26;
			int div = num/26;
			if(div<=26) {
			if(rem == 0){
				div--;
				retVal = retVal + alphabets.get(div)+alphabets.get(rem);
			}else 
				retVal = retVal + alphabets.get(div)+alphabets.get(rem);
			}else {
				retVal = retVal + alphabets.get(rem);
				while(div>26) {
					rem = div%26;
					div = div/26;
					if(div>26)
						retVal = alphabets.get(rem) + retVal;
					else
						retVal = alphabets.get(div) + alphabets.get(rem) + retVal;
				}
			}
		}
		return retVal;
	}
}