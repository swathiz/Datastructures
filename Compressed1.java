package gs;

import java.util.Stack;

public class Compressed1 {
	
	public static void main(String[] args) {
        String input = "aaaabbbb";
        String compressed = compress(input);
        System.out.println(compressed); 
    }
	
	public static String compress(String s) {
		
		if(s==null||s.isBlank()) {
			return "invalid input";
		}
		
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		while(len>1) {
				//add the odd even condition in the 26th line itself
				if(len%2==0 && s.substring(0, len/2).equals(s.substring(len/2, len))) {
					sb.insert(0, "*");
					len = len/2;
				}else {
					sb.insert(0,s.charAt(len-1));
					len--;	
				}	
		}
		sb.insert(0,s.charAt(0));
		return sb.toString();
	}

}
