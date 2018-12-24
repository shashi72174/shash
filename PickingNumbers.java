package com;

import java.util.HashMap;
import java.util.Map;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[] {4,6,5,3,3,1};
		int[] arr = new int[] {1,2,2,3,1,2};
		Map<String,Integer> map = new HashMap<String,Integer>();
		String iteratedChar = "";
		for(int i=0;i<arr.length;i++) {
			if(iteratedChar.contains(""+arr[i])) {
				continue;
			}
			iteratedChar = iteratedChar + arr[i];
			for(int j=0;j<arr.length;j++) {
				if((Math.abs(arr[i]-arr[j])<2 && Math.abs(arr[i]-arr[j])>-1) && (arr[i]!=arr[j]))
					if(map.get(""+arr[i]+"-"+arr[j])==null)
						map.put(""+arr[i]+"-"+arr[j],2);
					else {
						Integer val = map.get(""+arr[i]+"-"+arr[j]);
						map.put(""+arr[i]+"-"+arr[j],++val);

					}
			}
		}
		System.out.println(map);
	}

}
