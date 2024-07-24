package prac;

import java.util.HashSet;
import java.util.Set;

public class LongSubstringWithoutRepeatingCharacter {
	
	public static void main(String[] args) {
		
//		String s = "abcabcbb";
//		String s = "bbbb";
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		
		Set<Character> charArray = new HashSet<>();
		
		int l = 0, r = 0;
		int len = s.length();
		int result = 0;
		char ch;
		
		while(r<len) {
			ch = s.charAt(r);
			while(charArray.contains(ch)) {
				charArray.remove(s.charAt(l));
				++l;
			}
			charArray.add(ch);
			result = Math.max(result, r-l+1);
			++r;
		}
		return result;
        
    }

}
