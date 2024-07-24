package prac;

import java.util.Iterator;
import java.util.Stack;

public class AdjecentDuplicate {
	
	public static void main(String[] args) {
		String s = "abbaca";
		System.out.println(removeAllAdjecent(s));
		
	}
	
	public static String removeAllAdjecent(String s) {
		
		Stack<Character> st = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			if(!st.isEmpty() && st.peek()==s.charAt(i)) {
				st.pop();
			}else {
				st.push(s.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (Character c : st) {
			sb.append(c);
		}
		return sb.toString();
	}

}
