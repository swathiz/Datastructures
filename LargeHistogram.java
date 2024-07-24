package gs;

import java.util.Arrays;
import java.util.Stack;

public class LargeHistogram {
	
	public static void main(String[] args) {
		
		int[] input = {2,1,5,6};
//		int[] input = {2,1,5,6,2,3};
//		int[] input = {2,4};
// 		int[] input = {1,1,1};
		System.out.println(findArea(input));
		
	}
	
	public static int findArea(int[] input) {
		if(input == null || input.length == 0) {
			return 0;		
		}
		Stack<Integer> st = new Stack<>();
		int[] leftArray = new int[input.length];
		int[] rightArray = new int[input.length];
		
		for(int i=0;i<input.length;i++) {
			while(!st.isEmpty()&&input[st.peek()]>=input[i]) {
				st.pop();	
			}
			if(st.isEmpty()) {
				leftArray[i]=0;
			}else {
				leftArray[i]=st.peek()+1;
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			st.pop();
		}
	   for (int i = input.length-1; i >= 0; i--) {
		while(!st.isEmpty()&&input[st.peek()]>=input[i]) {
			st.pop();
		}
		if(st.isEmpty()) {
			rightArray[i]=input.length-1;
		}else {
			rightArray[i]=st.peek()-1;		
		}
		st.push(i);
	}
	   int area=0;
	   for(int i =0;i<input.length;i++) {
		   area = Math.max(area,input[i]*(rightArray[i]-leftArray[i]+1));
		   //boundary right index - boundary left index + 1 tp get the width
	   }
	   return area;
	}

}
