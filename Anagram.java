package prac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	
	public static void main(String[] args) {
		System.out.println(findAnagram("rat","catf"));
	}
	
	public static boolean findAnagram(String s, String t) {
		
		if(s==null || t == null || s.isBlank() || t.isBlank()) {
			return false;
		}
		if(s.length() != t.length()){
            return false;
        }

		
		Map<Character,Integer> mp = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {			
			mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for(char c:t.toCharArray()) {
			mp.put(c,mp.getOrDefault(c, 0)-1);
		}
//		System.out.println(mp);
		
		for(int val:mp.values()) {
			if(val!=0) {
				return false;
			}
		}
	return true;	
		
	}

}
