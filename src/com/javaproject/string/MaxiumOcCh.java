package com.javaproject.string;

import java.util.HashMap;
import java.util.Map;


public class MaxiumOcCh {
public static void main(String[] args) {
	String s="praajitkkk";
	HashMap<Character,Integer> hash=new HashMap<Character, Integer>();
	char[] c=s.toCharArray();
	for(char ch:c) {
		if(hash.containsKey(ch)) {
			hash.put(ch, hash.get(ch)+1);
			}else
				hash.put(ch, 1);
		
	
	
	}
	
}
}
