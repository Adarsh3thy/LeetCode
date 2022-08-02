package arraysandhashing;

import java.util.HashSet;

/*Find the missing element in the sequence of number, 
 * the numbers in the array are not sorted, if no 
 * element is missing in the array then return the max element+1
 * 
 * */

public class MissingElement {
	 public static int missingNumber(int[] nums) {
		
		 int min=nums[0],max=nums[0], total=0;
		// numsHash.add(nums[0]);
		 
		 for(int i=0;i<nums.length;i++) {
			 if(nums[i]<min)
				 min=nums[i];
			 
			 if(nums[i]>max)
				 max=nums[i];
			 
			 total+=nums[i];
			 
		 }
		 
		 int actualTotal=((max)*(max+1))/2;
		 int diff=actualTotal-total;
		 
		 if(diff==0 && min==1) {
			 return 0;
		 }else if(diff==0) {
			 return max+1;
		 }else
			 return diff;
		 
		
	 }
	 
	 public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {0,3,2,1}));
	}
}
