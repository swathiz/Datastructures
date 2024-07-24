package prac;

public class PalindromNumber {
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));
	}
	
	 public static boolean isPalindrome(int x) {
		 
		 int rev=0;
	        int temp=x;
	        while(x>0){
	            int digit=x%10;
	            rev=rev*10+digit;
	            x=x/10;
	        }
	        System.out.println(temp+" "+rev);
	        if(temp==rev){
	            return true;
	        }
	        return false;
	       
//		 String s = String.valueOf(x);
//		 int l = 0;
//		 int r = s.length()-1;
//		 while(l<r) {
//			 if(s.charAt(l)!=s.charAt(r)) {
//				 return false;
//			 }
//			 l++;
//			 r--;
//		 }
//		 return true;
	 }

}
