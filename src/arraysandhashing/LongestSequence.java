package arraysandhashing;

import java.util.HashSet;


/*https://leetcode.com/problems/longest-consecutive-sequence
 * Given an unsorted array of integers nums, return the 
 * length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is
 [1, 2, 3, 4]. Therefore its length is 4.
 * /*
 */

public class LongestSequence {
	
	  public static int longestConsecutive(int[] nums) {
		  
		  HashSet<Integer> numsHash=new HashSet<>();
		  int maxLength=1;
		  
		  if(nums.length<1) {
			  return 0;
		  }
		  for(int i:nums)
			  numsHash.add(i);
	        
		  for(int i=0;i<nums.length;i++) {
			  //System.out.println(nums[i]);
			  if(!numsHash.contains(nums[i]-1)) {
				  int length=1;
				  int j=1;
				  while(numsHash.contains(nums[i]+j)) {
					  length++;j++;
				  }
				  if(length>maxLength) {
					  maxLength=length;
				  }
			  }
		  }
		  
		  return maxLength;
	    }
	
	public static void main(String[] args) {
		System.out.println("Longest");
		System.out.println(longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
	}

}
