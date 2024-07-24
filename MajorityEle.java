package prac;

import java.util.HashMap;
import java.util.Map.Entry;

public class MajorityEle {
	
	public static void main(String[] args) {
		
//		Input: nums = [2,2,1,1,1,2,2]
//				Output: 2
		int[] nums = {2,2,1,1,1,2,2,3,3,3,3,3,3,3};
		System.out.println(majorityElement(nums));
		
	}
	
	public static int majorityElement(int[] nums) {
		
		
		int j = 0;
		HashMap<Integer,Integer> m = new  HashMap<>();
	
		for (int i = 0; i < nums.length; i++) {	
			m.put(nums[i],m.getOrDefault(nums[i],0)+1);

		}
		
//	System.out.println(m);
		int max = 0;
		for (Entry<Integer, Integer> entry : m.entrySet()) {
		
			if(entry.getValue() > max) {
				max = entry.getValue();
				j = entry.getKey();
			}
		}
		
		return j;
		
    }

}
