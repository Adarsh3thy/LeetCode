package arraysandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings

Input: ["lint","code","love","you"]

Output: ["lint","code","love","you"]
 */

public class EncodeDecodeString {
	
	 public static String encode(List<String> strs) {
		 
		 StringBuilder sb=new StringBuilder();
	       for(String s:strs) {
	    	   sb.append("#").append(s.length()).append(s);
	       }
	       return sb.toString();
	    }
	 
	 public static List<String> decode(String str) {
	        // write your code here
		 int i=0;
		 List<String> strs=new ArrayList<>();
		/* while(i<str.length()) {
			 if(str.charAt(i)=='#') {
				 i++;
				 int length=i+Integer.parseInt(String.valueOf(str.charAt(i)));
				 strs.add(str.substring(i+1, length+1));
				 i=length+1;
			 }
		 }*/
		 
		 char[] strArray=str.toCharArray();
		  i=0;
		 while(i<strArray.length) {
			 if(strArray[i]=='#') {
				 i++;
				 int length=i+Integer.parseInt(String.valueOf(strArray[i]));
				 int j=i+1;
				
				 StringBuilder sbTemp=new StringBuilder();
				 while(j<length+1) {
					 sbTemp.append(strArray[j]);
					 j++;
				 }
				 strs.add(sbTemp.toString());
				 i=length+1;
			 }
		 }
		 
		 return strs;
	    }
	 
	 public static void main(String[] args) {
		 
		 String encoded=encode(new ArrayList<>(Arrays.asList("lint","code","love","you")));
		 System.out.println(encoded);
		 
		 System.out.println(decode(encoded).toString());
	}

}
