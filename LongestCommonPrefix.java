package com.test;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// String[] str = new String[] { "flower", "flow", "leeds" };
		//String[] str = new String[] { "leetcode", "leet", "lee", "le" };
		String[] str = new String[] { "ca", "a" };
		//System.out.println("leetcode".indexOf("leets"));
		System.out.println(longestCommonPrefix(str));

	}

	public static String longestCommonPrefix(String[] strs) {
		int i = 0;
		int j = i + 1;
		String lcs = "";
		int lastIndex = -1;
		if(strs.length==0)
			return "";
		//handle all these else if inside for loop inside while [at line 31 onwards] 
		else if(strs.length==2 && strs[1].indexOf(strs[0])!=-1 && strs[0].length()<strs[1].length())
			return strs[0];
		else if(strs.length==2 && strs[0].indexOf(strs[1])!=-1 && strs[0].length()>strs[1].length())
			return strs[1];
		else if(strs.length==2 && strs[0].length()>strs[1].length()) 
			return "";
		while (i < strs.length - 1) {
			for (int k = 0; k < strs[i].length(); k++) {
				int index = strs[j].indexOf(strs[i].charAt(k), lastIndex);
				if (index != -1 && index > lastIndex) {
					lcs = lcs + strs[i].charAt(k);
					if (k < strs[i].length() - 1 && strs[i].charAt(k) == strs[i].charAt(k + 1))
						lastIndex = index + 1;
					else
						lastIndex = index;
				} else if (index != -1 && index >= lastIndex && strs[i].charAt(k) == strs[i].charAt(k - 1)) {
					lcs = lcs + strs[i].charAt(k);
					if (k < strs[i].length() - 1 && strs[i].charAt(k) == strs[i].charAt(k + 1))
						lastIndex = index + 1;
					else
						lastIndex = index;
				}
			}
			if (lcs.equals(""))
				return lcs;
			else {
				i++;
				strs[j] = lcs;
				j++;
				lastIndex = -1;
				lcs="";
			}
		}

		return strs[--j];
	}

}