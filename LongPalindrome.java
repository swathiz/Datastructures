package gs;

public class LongPalindrome {
	
	public static void main(String[] args) {
		String s = "forgeeKsskeegfor";
		System.out.println(longPalindrome(s));
		
	}
	public static String longPalindrome(String str) {
		int maxLength = 0;
		String p = "";
		
		if( str == null || str.isBlank()) {
			return "invalid string";
		}
		
		for (int i =0;i<str.length();i++) {
			for(int j = i+1;j<=str.length();j++) {
				String s = str.substring(i,j);
				//instead of using substring pass i,j in the place of substring in the ispalindrome fun
				if(isPalindrome(s) && s.length()>maxLength) { //interchage the condition
					maxLength = s.length();
					p = s;
				}
			}
		}
		return p;
	}
	
	public static boolean isPalindrome(String s) {
		int l = 0;
		int r = s.length()-1;
		
		while(l<r) {
			if(s.charAt(l) != s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

	}
