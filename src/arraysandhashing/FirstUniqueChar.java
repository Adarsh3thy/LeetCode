package arraysandhashing;

import java.util.HashMap;

/*
 * Return the position of the first non repeating character in the given string
 * Eg: Input: aabcd
 * Output: 2
 */

public class FirstUniqueChar {
	 public static int firstUniqChar(String s) {
		 char[] chArray=s.toCharArray();
		 
		 HashMap<Character,Integer> chCounts=new HashMap<>();
		 
		 for(int i=0;i<chArray.length;i++) {
			 if(chCounts.containsKey(chArray[i])) {
				 chCounts.replace(chArray[i],chCounts.get(chArray[i])+1 );
			 }else
				 chCounts.put(chArray[i], 1);
		 }
		 int nonRepeatingChar=-1;
		 for(int i=0;i<chArray.length;i++) {
			 if(chCounts.get(chArray[i])==1) {
				 nonRepeatingChar=i;
				 break;
			 }
		 }
		 
		 return nonRepeatingChar;
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println(firstUniqChar("aabfbss"));
	}
}
