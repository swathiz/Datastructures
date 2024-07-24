package gs;

import java.util.HashMap;

public class LengthOfCycle {
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,3};
//		int[] nums = {1,2,0};
//		int[] nums = {2,3,0};
//		int[] nums = {1,2,3,1};
		
		int si = 0;
		
		System.out.println(findLen(nums,si));		
	}
	
	public static int findLen(int[] input, int startind) {
		
		if(input==null||startind<0) {
			return -1;
		}
		int temp = startind;
		HashMap<Integer, Integer> result = new HashMap<>();
		while (temp < input.length) {
			result.put(temp, input[temp]);
			if (result.containsKey(input[temp])) {
				return result.size()-input[temp]+startind;	
			}
			temp = input[temp];
			if (result.size() == input.length) {
				return -1;
			}
		}
		return -1;
	}
}