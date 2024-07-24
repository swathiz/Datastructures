package prac;

public class GoodTriplets {
	
	public static void main(String[] args) {
//		int[] arr = {3,0,1,1,9,7};
		int[] arr = {1,1,2,2,3};
//		int a = 7,b = 2,c = 3;
		int a = 0,b = 0,c = 1;
		System.out.println(findGoodTriplets(arr,a,b,c));
	}

	public static int findGoodTriplets(int[] arr, int a, int b, int c) {
		int cnt = 0;
		for (int i = 0; i < arr.length-2; i++) {
			for(int j = i+1; j < arr.length-1; j++) {
				if(Math.abs(arr[i]-arr[j]) <= a)
					for(int k = j+1; k < arr.length;k++) {
						if(Math.abs(arr[j]-arr[k]) <= b && Math.abs(arr[i]-arr[k]) <= c) {
							cnt++;
					}
				}
			}
		}
		return cnt;
	}

}
