package prac;

import java.util.ArrayList;
import java.util.List;

public class TripletsSumZero {
	
	public static void main(String[] args) {
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		
		System.out.println(threeSum(nums));
	}
	
	public static List<List<Integer>> threeSum(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0;i<nums.length;i++) {
			for (int j = i;j<nums.length;j++) {
				for(int k = j;k<nums.length;k++) {
					if(nums[i]+nums[j]+nums[k]==0) {
						ArrayList<Integer> li = new ArrayList<>();
						li.add(nums[i]);
						li.add(nums[j]);
						li.add(nums[k]);
						result.add(li);
						
					}
				}
			}
		}
		return result;
	}

}
