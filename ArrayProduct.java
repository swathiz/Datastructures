package gs;

import java.util.Arrays;

public class ArrayProduct {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		int[] result = productExceptSelf(nums);
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] productExceptSelf(int[] nums) {
		int[] d = {-1};
		if(nums == null || nums.length==0) {
			return d;
		}
		int n = nums.length;
		int[] leftP = new int[n];
		int[] rightP = new int[n];
		int[] result = new int[n];
		leftP[0] = 1;
		for(int i = 1;i<n;i++) {
			leftP[i] = leftP[i-1]*nums[i-1];
			
		}
		System.out.println(Arrays.toString(leftP));
		rightP[n-1] = 1;
		for(int i = n-2;i>=0;i--) {
			
			rightP[i] = rightP[i+1]*nums[i+1];
		}
		System.out.println(Arrays.toString(rightP));
		for(int i =0;i<n;i++) {
			result[i] = leftP[i]*rightP[i];
		}
		
		return result;
	}

}
