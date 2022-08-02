package twopointers;

public class BinSearch {
	
	  
    public static int binarySearch(int[] nums,int low,int high,int target){
    	
    	if(low>high)
    		return -1;
    	else
    	{
    		int mid=(low+high)/2;
    		if(nums[mid]==target)
    			return mid;
    		else if(nums[mid]<target)
    			return binarySearch(nums,mid+1,high,target);
    		else
    			return binarySearch(nums,low,mid,target);
    	}
    }
    
    
 public static int binarySearchItr(int[] nums,int low,int high,int target){
    	
	 
	 	while(low<=high) {
	 		
	 		int mid=(low+high)/2;
	 		//System.out.println(mid);
	 		if(nums[mid]==target)
    			return mid;
	 		else if(nums[mid]<target)
	 			low=mid+1;
	 		else
	 			high=mid-1;
	 			
	 		
	 	}
    	return -1;
    }
    
    public static int search(int[] nums, int target) {
    	return binarySearchItr( nums,0,nums.length-1,target);
    }
    
    public static void main(String[] args) {
    	System.out.println(search(new int[] {1,2,3,4,5,6,7},999));
    	
	}

}
