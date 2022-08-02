package twopointers;


/*
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * */
public class twopinters2 {
	 public static int[] twoSum(int[] numbers, int target) {
		 
		 int i=0,j=numbers.length-1;
		 int[] output=new int[2];
		 while(i<j) {
	        if(numbers[i]+numbers[j]==target) {
	        	output[0]=i+1;
	        	output[1]=j+1;
	        	break;
	        }
	        else if(numbers[i]+numbers[j]<target) {
	        	i++;
	        }else
	        	j--;
		 }
		 return output;
	    }
	 	
	 public static void main(String[] args) {
		int[] out=twoSum(new int[] {2,7,11,15},9);
		for(int n:out)
			System.out.print(n+" ");
	}

}
