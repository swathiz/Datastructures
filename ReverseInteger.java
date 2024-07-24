package prac;

public class ReverseInteger {
	
	 public static int reverse(int x) {
		 int num = Math.abs(x);
	        int reminder = 0;
	        int rev = 0;
	        while(num!=0){
	            reminder = num%10;
	            if (rev > (Integer.MAX_VALUE - reminder) / 10) {
	                return 0;  
	            }
	            rev = rev * 10 +reminder;
	            x = x/10;     
	        }
	        
//	        if(x<0) {
//	        	rev = -rev;
//	        }

	        return (x<0)?-rev:rev;
	    }
	        
	 
	 public static void main(String[] args) {
//		System.out.println(1534236469%10);
		 System.out.println(reverse(1534236469));
		 System.out.println(reverse(-123));
		 
		 System.out.println(Math.sqrt(20));
	}

}
