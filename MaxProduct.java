package prac;

import java.util.PriorityQueue;

public class MaxProduct {
	
	public static void main(String[] args) {
		
//		int[] nums = {3,4,5,2};
//		int[] nums = {1,5,4,5};
//		int[] nums = {3,7};
		int[] nums = {1,2,3,4};
		System.out.println(getMaxProductt(nums));
	}

	public static int getMaxProduct(int[] nums) {
		
		int max = 0;
		for(int i = 0;i < nums.length-1;i++) {
			for(int j = i+1;j < nums.length;j++) {
				int pro = (nums[i]-1)*(nums[j]-1);
				if(pro>max) {
					max = pro;
				}
			}
		}
		
		return max;
	}
	
	public static int getMaxProductt(int[] nums) {
		if(nums == null || nums.length < 2) {
			return -1;
		}
		
		PriorityQueue<Integer> qu = new PriorityQueue<>();
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			
			qu.add(nums[i]);
//			System.out.println(qu);
			if(qu.size()>2) {
				qu.remove();
			}
			
//			System.out.println(qu);
		}
		return (qu.poll()-1)*(qu.poll()-1);
	}

	
}
