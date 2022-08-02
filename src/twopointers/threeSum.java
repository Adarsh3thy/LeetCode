package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/3sum/
 * too long refer link
 * */

public class threeSum {
	
public static List<List<Integer>> threeSum(int[] nums) {
	
	Arrays.sort(nums);
	
	
	List<List<Integer>> result=new ArrayList<>();
	
	for(int i=0;i<nums.length;i++) {
		
		if(i>0 && nums[i]==nums[i-1]) {
			System.out.println(i);
			continue;
		}
			
		int l=i+1;
		int r=nums.length-1;
		
		
		System.out.println("i: "+i+" l: "+l+" r: "+r);
		while(l<r) {
		if(nums[i]+nums[l]+nums[r]==0) {
			List<Integer> resElem=new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r]));
			result.add(resElem);
			l++;
			while(l<r && nums[l]==nums[l-1])
			l++;
		}
		else if(nums[i]+nums[l]+nums[r]<0) {
			l++;
		}else
			r--;
		}
		//System.out.println(result.toString());
	}
	return result;
        
    }
	public static void main(String[] args) {
		System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}).toString());
	}
}
