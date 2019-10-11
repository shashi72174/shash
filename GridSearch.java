package com.hackerrank;

public class GridSearch {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		//String[] grid = new String[] {"7283455864","6731158619","8988242643","3830589324","2229505813","5633845374","6473530293","7053106601","0834282956","4607924137"};
		//String[] pattern = new String[] {"9505","3845","3530"};
		//String[] grid = new String[] {"400453592126560","114213133098692","474386082879648","522356951189169","887109450487496","252802633388782","502771484966748","075975207693780","511799789562806","404007454272504","549043809916080","962410809534811","445893523733475","768705303214174","650629270887160"};
		//String[] pattern = new String[] {"99","99"};
		String[] grid = new String[] {"1234567890","0987654321","1111111111","1111111111","2222222222"};
		String[] pattern = new String[] {"876543","111111","111111"};
		System.out.println(gridSearch(grid,pattern));
		System.out.println(System.currentTimeMillis());
	}
	
	public static String gridSearch(String[] grid, String[] pattern) {
		int j=0;
		int index = -1;
		for(int i=0;i<grid.length;i++) {
			while(j<pattern.length) {
				if(grid[i].indexOf(pattern[j]) == -1) {
					j=0;
					break;
				}else if(j == (pattern.length-1) && grid[i].indexOf(pattern[j]) != -1 && (index == grid[i].indexOf(pattern[j]) || isStringContainsSameCharacter(grid[i])))
					return "YES";
				else {
					if(j==0 && isStringContainsSameCharacter(grid[i])) {
						j++;
						break;
					}else if(j==0) {
						index = grid[i].indexOf(pattern[j]);
						j++;
					}else {
						if(index == -1 && (isStringContainsSameCharacter(grid[i])) || grid[i].indexOf(pattern[j]) != -1) {
							j++;
						}
					}
					
					if(j==0 || isStringContainsSameCharacter(grid[i])) {
						index = grid[i].indexOf(pattern[j]);
						j++;
					}else {
						if(index == grid[i].indexOf(pattern[j]))
							j++;
						else
							j=0;
					}
					break;
				}
			}
		}
		return "NO";
	}
	
	public static boolean isStringContainsSameCharacter(String s) {
		boolean isSameChar = true;
		char initialChar = s.charAt(0);
		for(int i=1;i<s.length();i++) {
			if(initialChar != s.charAt(i))
				return false;
		}
		return isSameChar;
	}
}