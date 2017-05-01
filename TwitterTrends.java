package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TwitterTrends {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<(n+1);i++) {
			String s = in.nextLine();
			String[] splitStr = s.split(" ");
			for(String s1 : splitStr) {
				if(s1.contains("#")){
					if(map.get(s1.substring(1))!=null){
						int val = map.get(s1.substring(1));
						map.put(s1.substring(1), ++val);
					}else
						map.put(s1.substring(1), 1);
				}
			}
		}
		int big = Collections.max(map.values());
		List<String> finalList = new ArrayList<>();
		List<String> l1 = new ArrayList<>();
		while(big>0) {
			for(String s1 : map.keySet()){
				if(map.get(s1)==big) 
					l1.add("#"+s1);
			}
			Collections.sort(l1);
			finalList.addAll(l1);
			big--;
			l1.clear();
		}
		System.out.println(finalList);
		in.close();
	}
}