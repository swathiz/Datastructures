package prac;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(findMissingNum(nums));
	}

	public static int findMissingNum(int[] nums) {
		
		int n = nums.length;
		int sumN = n*(n+1)/2;
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
	
		return sumN-sum;
	}

}
