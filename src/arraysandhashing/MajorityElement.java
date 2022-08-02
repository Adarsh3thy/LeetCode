package arraysandhashing;

import java.util.HashMap;

public class MajorityElement {

	public static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> numsCount = new HashMap<>();
		int n=nums.length;
		for (int num : nums) {
			if (numsCount.containsKey(num)) {
				numsCount.replace(num, numsCount.get(num) + 1);
			} else
				numsCount.put(num, 1);
		}
		int maxElement=0;
		for(int key:numsCount.keySet()) {
			
			
			int val=numsCount.get(key);
			if(val>n/2 ) {
				
				maxElement=key;
				break;
			}
		}
		
		return maxElement;
	}
	
	
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
	}
}
