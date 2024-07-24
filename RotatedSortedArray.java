package gs;

public class RotatedSortedArray {
	
	public static void main(String[] args) {
		
//		int[] input = {5,2,3,4};
		int[] input = {2,1};
		System.out.println(getMin(input));
		
	}
	
	public static int getMin(int[] input) {
		
		if(input == null || input.length == 0){
			return 0;
		}
		
		if(input.length == 1) {
			return input[0];
		}
		
		int result = Integer.MAX_VALUE;
		int low = 0;
		int high = input.length-1;
		while(low<high) {
			int mid = (low+high)/2;
			if(input[low]<=input[mid]) {
				result = Math.min(result, input[low]);
				low = mid+1;
			}else {
				result = Math.min(result, input[mid]);
				high = mid-1;
			}
		}
		return result;
	}

}
