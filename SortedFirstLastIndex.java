package prac;

import java.util.Arrays;

public class SortedFirstLastIndex {
	
	public static void main(String[] args) {
//		int nums[] = {1,1,1,1,2,2,2,2,2,3,3,3,3,3,3,4,4,4,4,4};
		int nums[] = {5,7,7,8,8,10};
//		int nums[] = {};
		int target = 6;
		int startIndex = findIndex(nums,target,true);
		int endIndex = findIndex(nums,target,false);
		System.out.println(Arrays.toString(new int[] {startIndex,endIndex}));
	}
	
	public static int findIndex(int[] nums, int target, boolean flag) {
		int l = 0,h=nums.length-1;
		int ans = -1;
		
		while(l<=h) {
			int mid = (l+h)/2;
			
			if(target==nums[mid]) {
				ans = mid;
				if(flag) {
					h = mid-1;
				}else {
					l = mid+1;
				}
			}else if(target > nums[mid]) {
				l = mid+1;
			}else {
				h = mid-1;
			}
		}
		
		return ans;
	}

}
