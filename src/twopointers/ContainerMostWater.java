package twopointers;

/*
 * https://leetcode.com/problems/container-with-most-water/
 * */

public class ContainerMostWater {
	
	 public int maxArea(int[] height) {
		 
		 int maxArea=0;
		 int i=0,j=height.length-1;
		 while(i<j) {
			 int area=Math.min(height[i], height[j])*(j-i);
			 if(area>maxArea)
				 maxArea=area;
			 
			 if(height[i]>height[j])
				 j--;
			 else
				 i++;
		 }
		 
		 return maxArea;
	        
	    }

}
