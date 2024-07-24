package gs;

public class SecMin {
	public static void main(String[] args) {
		int[] arr = {3,9,8,8,5,3,3};
		int sMin = findSecondMin(arr);
		System.out.println(sMin);
		
	}
	
	public static int findSecondMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		int sMin = Integer.MAX_VALUE;
		
		if(arr.length < 2) {
			return -1;
		}
		
		for (int num:arr) {
			if(num<min) {
				sMin = min;
				min = num;
			}else if(num < sMin && num >min) {
				sMin = num;
			}
		}
		return sMin;
	}

}
