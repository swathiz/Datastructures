package gs;

public class Median1 {
	
	public static void main(String[] args) {
		
//		int arr1[] = {1,3,8,7};
//		int arr2[] = {5,6,7,19,22,25};
		
//		int arr1[] = {1,2};
//		int arr2[] = {3,4};
		
		int arr1[] = {2,3,4};//-3,-2,-1,2,3,4 
		int arr2[] = {-3,-2,-1};
		
//		int arr1[] = null;
//		int arr2[] = null;
		
//		int arr1[] = {1,2,3,7,8,9};
//		int arr2[] = {4,5,6,10,11,12,13};
		
		System.out.println(findMedian(arr1,arr2));
	}

	private static float findMedian(int[] arr1, int[] arr2) {
		
		if((arr1 == null && arr2  == null) || (arr1.length == 0 && arr2.length==0)) {
			return (float) 0.0;
		}
		
		if(arr2.length < arr1.length) {
			return findMedian(arr2, arr1);
		}
		
		int l = 0, h = arr1.length;
		
		while(l<=h) {
			
			int m1 = (l+h)/2; 
			if(l==0&&h==1) {
				m1 = 1;
			}
//			System.out.println(m1);
			int m2 = ((arr1.length + arr2.length+1)/2) - m1;
			
			int l1 = (m1==0)?0:arr1[m1-1];
//			System.out.println(l1);
			int r1 = (m1==arr1.length)?Integer.MAX_VALUE:arr1[m1];
			
			int l2 = (m2==0)?0:arr2[m2-1];
//			System.out.println(l2);
			int r2 = (m2==arr2.length)?Integer.MAX_VALUE:arr2[m2];
			
			if(l1<=r2 && l2<=r1) {
				if((arr1.length + arr2.length) % 2 == 0) {
					System.out.println("even"+Integer.max(l1, l2)+Integer.min(r1,r2));
					System.out.println(5/2);
					
					return ((Float.max(l1, l2))+(Float.min(r1,r2)))/2;
				} else {
					System.out.println(l1+" " +l2);
					System.out.println("odd");
					return Float.max(l1, l2);
				} 
			}else if(l2>r1) {
				l=m1+1;
			}else {
				h=m1-1;
			}
		}
		return 0.0f;
	}
}
