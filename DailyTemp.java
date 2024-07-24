package gs;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
	
	public static void main(String[] args) {
//		int input[] = {30,40,50};
//		int input[] = {99,99,99,99,99,100};
		int input[] = {73,74,75,71,69,72,76,73};
		System.out.println(Arrays.toString(getTemp(input)));
	}
	
	public static int[] getTemp(int[] input) {
		int output[] = new int[input.length];
		Stack<Integer> st = new Stack<Integer>();
		for(int i = 0; i<input.length;i++) {
			
			while(!st.isEmpty() && input[i]>input[st.peek()]) {
				output[st.peek()]=i-st.pop();
			}	
			st.push(i);
		}
		return output;	
	}
}
