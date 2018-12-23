package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LexStringComparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "Welcometojava";// scanner.nextLine();
		int i = 0, n = 3;// scanner.nextInt(),
		List<String> list = new ArrayList<String>();
		while (str.length() >= n) {
			list.add(str.substring(i, n));
			i = 1;
			str = str.substring(i);
			i = 0;
			Collections.sort(list, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					return o1.compareTo(o2) > 0 ? 1 : o1.compareTo(o2) < 0 ? -1 : 0;
				}
			});
		}
		System.out.println(list.get(0));
		System.out.println(list.get(list.size() - 1));
		scanner.close();
	}
}