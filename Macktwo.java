package gs;

public class Macktwo {
	
	public static void main(String[] args) {
		 String input = "forgeeKsskeegfor";
		 System.out.println(getLongPalindrome(input));
	}
	
	
	//forgeeksskeegfor
	public static String getLongPalindrome(String input) {
		
		if(input == null ||input.isBlank()) {
			return "invalid input";
		}
		
		int maxLength = 0;
		String palindrome = "";
		for(int i = 0;i<input.length();i++) {
			for(int j=i+1;j<=input.length();j++) {
				String s = input.substring(i,j);
//				System.out.println(s);
				if(  isPalindrome(s) && s.length()>maxLength) {
					maxLength = s.length();
					palindrome = s;
				}
				
			}
		}
		
		return palindrome;
	}
	
	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}

}
