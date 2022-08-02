package arraysandhashing;

import java.util.HashMap;
import java.util.HashSet;

/*
 * https://leetcode.com/problems/isomorphic-strings/
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another 
character while preserving the order of characters.
 No two characters may map to the same character, 
 but a character may map to itself.
 Input: s = "paper", t = "title"
Output: true
Input: s = "foo", t = "bar"
Output: false
 */

public class Isomorhic {
	
public static  boolean isIsomorphic(String s, String t) {
	 HashMap<Character,Character> isoMap=new HashMap<>();
	 HashMap<Character,Character> isoReverseMap=new HashMap<>();
	
	 
	if(s.length()!=t.length())
		return false;
	
	if(s==null && t==null)
		return true;
	
	for(int i=0;i<s.length();i++) {
		if(!isoMap.containsKey(s.charAt(i))
				&& !isoReverseMap.containsKey(t.charAt(i))) {
			isoMap.put(s.charAt(i), t.charAt(i));
			isoReverseMap.put( t.charAt(i),s.charAt(i));
		}else {
			if(!isoMap.containsKey(s.charAt(i)) || isoMap.get(s.charAt(i))!=t.charAt(i))
				return false;
		}
		
		
	}
	return true;	
    }

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg","add"));
	}

}
