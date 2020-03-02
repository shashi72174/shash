package test1;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		//String[] str = new String[] { "flower", "flow", "leeds" };
		String[] str = new String[] { "leets", "leetcode", "leeds" };
		System.out.println(longestCommonPrefix(str));
		
	}

	public static String longestCommonPrefix(String[] strs) {
		int i=0;
		int j = i+1;
		String lcs="";
		int lastIndex = -1;
		while(i<strs.length-1) {
			if(i==0) {
				for(int k=0;k<strs[i].length();k++) {
					int index = strs[j].indexOf(strs[i].charAt(k),lastIndex);
					if(index != -1 && index > lastIndex) {
						lcs = lcs+strs[i].charAt(k);
						if(k<strs[i].length()-1 && strs[i].charAt(k)==strs[i].charAt(k+1))
							lastIndex = index+1;
						else
							lastIndex = index;
					}else if(index != -1 && index >= lastIndex && strs[i].charAt(k)==strs[i].charAt(k-1))
						lcs = lcs+strs[i].charAt(k);
				}
				if(lcs.equals(""))
					return lcs;
				else {
					i++;
					j++;
					lastIndex = -1;
				}
			}else {
				
			}
		}
		
		
		return lcs;
	}

}
