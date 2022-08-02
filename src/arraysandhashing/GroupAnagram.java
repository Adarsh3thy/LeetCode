package arraysandhashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Given an array of strings strs, 
 * group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase 
formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Input: strs = ["a"]
Output: [["a"]]
 * */

public class GroupAnagram {

	public static List<List<String>> groupAnagrams(String[] strs) {
		
		HashMap<String,List<String>> resultHash=new HashMap<>();
		List<List<String>> res=new ArrayList<>();
		
		for(String s:strs) {
			char[] hash=new char[26];
			for(int i=0;i<s.length();i++) {
				hash[s.charAt(i)-'a']++;
			}
			String hashKey=new String(hash);

			if(resultHash.containsKey(hashKey)) {
				List<String> tempList=resultHash.get(hashKey);
				tempList.add(s);
				resultHash.replace(hashKey, tempList);
				
			}else {
				
				List<String> tempList=new ArrayList<>();
				tempList.add(s);
				resultHash.put(hashKey, tempList);
			}
		}
		res.addAll(resultHash.values());
		return res;
	}

	public static void main(String[] args) {
		List<List<String>> res=	groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
		System.out.println(res.toString());
	}

}
