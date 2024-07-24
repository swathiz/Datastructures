package gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] input = {3,2,4};
		int target = 6;
		int[] r = findIndex(input,target);
		System.out.println(Arrays.toString(r));
	}
public static int[] findIndex(int[] input,int target) {
		if(input==null || input.length ==0 || input.length == 1   ) {
			return new int[] {-1,-1};
		}
		Map<Integer,Integer> result = new HashMap<>();
		for(int i = 0;i<input.length;i++) {
			int difference = target-input[i];
			if(result.containsKey(difference)) {
				return new int[] {result.get(difference),i};
			}
			result.put(input[i],i);
		}
		return new int[] {};
	}
	
	public static int[] findIndex1(int[] input,int target) {
		if(input==null || input.length ==0) {
			return new int[] {-1,-1};
		}	
		int[] result = new int[2];
		for(int i =0;i<input.length;i++) {
			for (int j =i+1;j<input.length;j++) {
				if((input[i]+input[j]) == target) {
					result[0] = i;
					result[1] = j;
					break;
				}			}}
		return result;
		
	}
	



}
