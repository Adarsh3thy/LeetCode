package arraysandhashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Topk {
	
	 public static int[] topKFrequent(int[] nums, int k) {
	     
		 HashMap<Integer,Integer> countsHash=new HashMap<>();
		 
		 for(int i=0;i<nums.length;i++) {
			 if(countsHash.containsKey(nums[i])) {
				 int value=countsHash.get(nums[i]);
				 countsHash.put(nums[i], ++value);
			 }
			 else
				 countsHash.put(nums[i],1); 
		 }
		 
		 ArrayList<ArrayList<Integer>> topkElements=
				 new ArrayList<>(nums.length+1);
		 
		 for(int i=0;i<nums.length+1;i++) {
			 topkElements.add(i, new ArrayList<Integer>());
		 }
				 
		 System.out.println(topkElements.size());
		 for (int key : countsHash.keySet()) {
			 int index=countsHash.get(key);
			 System.out.println("index: "+index+" key "+key);
			// System.out.println("key: "+key+" value: "+countsHash.get(key));
			
				 System.out.println("if block");
				 ArrayList<Integer> tempList=topkElements.get(index);
				 tempList.add(key);
				 System.out.println(tempList.toString());
				 topkElements.set(index, tempList);
			 
			 System.out.println(topkElements.toString());
			 
			 
			 
		 }
		 
		
		 
		 int result[]=new int[k];int j=0;
		 for(int i=topkElements.size()-1;i>=1 && k>0;i--) {
			// System.out.println(topkElements[i]);
			 if(topkElements.get(i)!=null) {
				 
				 for(int num:topkElements.get(i) ) {
					 System.out.println(num);
					 result[j]=num;
					 j++;k--;
					 if(k<=0) break;
				 }
				
			 }
		 }
		 
		 return result;
	    }
	 
	
	 
	 public static void main(String[] args) {
		int[] res= topKFrequent(new int[] {5,2,5,3,5,3,1,1,3},2);
		System.out.println();
		for(int num:res) {
			
			System.out.println(num);
		}
	}

}
