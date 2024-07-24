package gs;

import java.util.HashMap;

public class SumSubarray {
	
	public static void main(String[] args) {
		
		int nums[] = {2,3,1,2,4,3};
		int k = 7;
		
		System.out.println(subarraySum(nums,k));	
	}
	public static int subarraySum(int[] nums, int k) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int n = nums.length;
		int sum = 0;
		int i = 0,res = Integer.MAX_VALUE;
		
		for(int j = 0;j<n;j++) {
			sum = sum + nums[j];
			while(sum>=k) {
				res = Math.min(res,j-i+1);
				sum = sum- nums[i];
				i++;
			}
		}
	
		return res == Integer.MAX_VALUE ? 0: res;
	}

}
