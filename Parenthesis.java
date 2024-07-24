package gs;

import java.util.Iterator;
import java.util.Stack;

public class Parenthesis {
	
	public static void main(String[] args) {
		
		String input = "[{}]";
		System.out.println(isValid(input));
		
	}
	
	public static boolean isValid(String input) {
		
		if(input == null || input.isBlank()) {
			return false;
		}
		Stack<Character> st = new Stack<>();
		
		for (int i=0;i<input.length();i++) {
				
			switch(input.charAt(i)) {
			case '(':
				st.push(')');
				break;
			case '{':
				st.push('}');
				break;
			case '[':
				st.push(']');
				break;
				//we are dng stack.push to check the order it wch it shld be popped out
			default:
				if(st.isEmpty() || st.pop() != input.charAt(i)) {
					return false;
				}
			}
		}
		return st.isEmpty();
	}

}
