package gs;

public class PowerTen {
	
	public static void main(String[] args) {
		
		 
		int a=100;
		int b=10;
		
		System.out.println(power(a,b));
		
		
//		int n = 101;
//		 boolean isPowerOfTen = true;
//		 
//		 while(n > 1) {
//			 if(n%10!=0) {
//				 isPowerOfTen = false;
//				 break;
//			 }
//			 n/=10;
//		 }
		 
//		 if(isPowerOfTen) {
//			 System.out.println(isPowerOfTen);
//		 }else {
//			 System.out.println(isPowerOfTen);
//		 }
	}
	
	public static boolean power(int a,int b) {
		
		 if(a==1) {
			 return true;
		 }
		 
		 if(a<=0) {
			 return false;
		 }
		 while(a > 1) {
			 if(a%b!=0) {
				 return false;
			 }
			 a/=b;
		 }
		 
		return true;
	}

}
