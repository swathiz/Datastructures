package gs;

public class Gcd {
	
	public static void main(String[] args) {
		int a = 0;
		int b = 8;
		System.out.println(gcd(a,b));
	}
		
	public static int gcd(int a,int b) {
		
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		
		return a;
	}

}
