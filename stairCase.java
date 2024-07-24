package gs;

public class stairCase {
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(countWays(n));
	}
	public static int countWays(int n) {
		if(n<0) {
			return 0;
		}
		if(n==1||n==2||n==0) {
			return n;
		}
//		int[] a = new int[n+1];
		int a = 1;
		int b = 2;
		int c = 4;
		int result = 0;
		if(n==3) {
			return c;
		}
		
		for(int i = 3;i<n;i++) {
			result = a+b+c;
			a=b;
			b=c;
			c = result;
		}
		
		return result;
	}

}
