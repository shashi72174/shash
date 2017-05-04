package com.shashi;

import java.util.*;

public class CaeserCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //String s = "1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M";
        //String s = "middle-Outz";
        String s = in.next();
        int k = in.nextInt();;
        String finalStr = "";
        
        Map<Integer,Integer> lowerMap = new HashMap<Integer,Integer>();
        int val = 96;
        for(int i=0;i<=k;i++) {
        	if(i%26==0){
        		lowerMap.put(122+i, 122);
        		val = 96;
        	}
        	else {
        		lowerMap.put(122+i, ++val);
        	}
        	
        }
        
        Map<Integer,Integer> upperMap = new HashMap<Integer,Integer>();
        val = 64;
        for(int i=0;i<=k;i++) {
        	if(i%26==0){
        		upperMap.put(90+i, 90);
        		val = 64;
        	}
        	else {
        		upperMap.put(90+i, ++val);
        	}
        	
        }
        for(int i=0;i<n;i++) {
        	if(((int)s.charAt(i))>96 && ((int)s.charAt(i))<123) {
        		int asciiVal = (int)s.charAt(i);
        		int finalVal = asciiVal+k;
        		
        		if(finalVal>96 && finalVal<123)
        			finalStr = finalStr + (char)finalVal;
        		else {
        			/*int newVal = finalVal-26;
        			finalStr = finalStr + (char)newVal;*/
        			finalStr = finalStr + (char)(lowerMap.get(finalVal).intValue());
        			
        		}
        	}else if(((int)s.charAt(i))>64 && ((int)s.charAt(i))<91) {
        		int asciiVal = (int)s.charAt(i);
        		int finalVal = asciiVal+k;
        		
        		if(finalVal>64 && finalVal<91)
        			finalStr = finalStr + (char)finalVal;
        		else {
        			/*int newVal = finalVal-26;
        			finalStr = finalStr + (char)newVal;*/
        			finalStr = finalStr + (char)(upperMap.get(finalVal).intValue());
        		}
        	}else 
        		finalStr = finalStr + s.charAt(i);
        	
        }
        
        System.out.println(finalStr);
        in.close();
	}

}
