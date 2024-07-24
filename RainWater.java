package gs;

import java.util.Arrays;

public class RainWater {
	
	public static void main(String[] args) {
		int[] height = {4,2,0,3,2,5};
		System.out.println(findWater(height));
		
	}
	
	public static int findWater(int[] input) {
		if(input==null || input.length ==0) {
			return 0;
		}
		int n = input.length;
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		int max = 0;
		for (int i =0;i<n;i++) {
			
			if(input[i]>max) {
				max = input[i];
			}
			leftMax[i]=max;
		}
		System.out.println(Arrays.toString(leftMax));
		max = 0;
		for (int i =n-1;i>=0;i--) {
			if(input[i]>max) {max = input[i];}
			rightMax[i]=max;
		}
		
		System.out.println(Arrays.toString(rightMax));
		int water = 0;
		for(int i = 0;i<n;i++) {
			int min = Integer.min(leftMax[i],rightMax[i]);
			water = water +(min-input[i]);	
		}
		return water;
	}

}
