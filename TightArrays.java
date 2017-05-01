package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TightArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int c = in.nextInt();
	        int result = shortestTightArray(a, b, c);
	        System.out.println(result);
	}

	private static int shortestTightArray(int a, int b, int c) {
		List list = new ArrayList();
		if(a>b) {
			for(int i=a;i>b;i--) 
				list.add(i);
		}else {
			for(int i=a;i<b;i++) 
				list.add(i);
		}
		if(b>c) {
			for(int i=b;i>=c;i--) 
				list.add(i);
		}else {
			for(int i=b;i<=c;i++) 
				list.add(i);
		}
		return list.size();
	}

}