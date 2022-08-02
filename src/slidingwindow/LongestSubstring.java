package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	  public static int lengthOfLongestSubstring(String s) {
		  
		  char[] stArray=s.toCharArray();
		  Set<Character> subString=new HashSet<>();
		  
		  if(stArray.length==0)
			  return 0;
		  
		  if(stArray.length==1)
			  return 1;
		  
		  int count=0,maxCount=0;
		  for(int i=0;i<stArray.length;i++) {
			  if(subString.add(stArray[i])) {
				  count++;
			  }else {
				  
				  subString.clear();
				  subString.add(stArray[i]);
				  count=1;
			  }
			  if(count>maxCount) {
				  maxCount=count;
			  }
			  
			  
		  }
		  return maxCount;
		  
	        
	    }
	  
	  public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcadbcbb"));
	}
}
