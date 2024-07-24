package gs;

import java.util.Stack;

public class LarHistogram {
	public static void main(String[] args) {
		
		int[] input = {2,1,5,6,3,3};
		System.out.println(getLargeHistogram(input));
	}

	private static int getLargeHistogram(int[] input) {
		
		if(input == null || input.length == 0) {
			return 0;	
		}
		Stack<Integer> st = new Stack<>();
		int max = 0;
		int n = input.length;
		for (int i = 0; i <= input.length; i++) {
			while(!st.empty() && (i==n || input[st.peek()]>=input[i])) {
				int height = input[st.peek()];
				st.pop();
				int width;
				if(st.empty()) {
					width = i;
				}else {
					width = i-st.peek()-1;
				}
				max = Math.max(max, width*height);
			}
			st.push(i);
		}
		return max;
	}
	
	

}
