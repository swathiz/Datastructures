package gs;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class MaxRectangle {
	
public static int findArea(int[] input) {
		Stack<Integer> st = new Stack<>();
		int[] leftArray = new int[input.length];
		int[] rightArray = new int[input.length];
		for(int i=0;i<input.length;i++) {
			while(!st.isEmpty()&&input[st.peek()]>=input[i]) {
				st.pop();	}
			if(st.isEmpty()) {
				leftArray[i]=0;
			}else {
				leftArray[i]=st.peek()+1;}
				st.push(i);} 
		while(!st.isEmpty()) {st.pop();}
	   for (int i = input.length-1; i >= 0; i--) {
		while(!st.isEmpty()&&input[st.peek()]>=input[i]) {
			st.pop();
		}
		if(st.isEmpty()) {
			rightArray[i]=input.length-1;
		}else {
			rightArray[i]=st.peek()-1;		
		}
		st.push(i);} 
	   int area=0;
	   for(int i =0;i<input.length;i++) {
		   area = Math.max(area,input[i]*(rightArray[i]-leftArray[i]+1));}
	   return area;
	}
	public static int findLargestRectangle(String[][] matrix) {
		if(matrix == null) {
			return 0;
		}
		if(matrix.length==1 && matrix[0].length==1 ) {
			return Integer.valueOf(matrix[0][0]);
		}
		int[] height = new int[matrix[0].length];
		int maxArea=0;
		int area;
		for(int i=0; i<matrix.length;i++) {
			for(int j =0;j<matrix[0].length;j++) {
				if(Objects.equals(matrix[i][j],'1')) { height[j]++;}
				else { height[j]=0;}}
			area = findArea(height);
			maxArea=Integer.max(area,maxArea);
		}
		return maxArea; 
 	}

	public static void main(String[] args) {
		
		String[][] matrix = {{"0"}};
//		String[][] matrix = {{"1","0","1","0","0"},{"1","0","0","1","1"},{"1","1","1","1","1"},{"1","0","0","1","0"}};
		System.out.println(findLargestRectangle(matrix));
		
	}

}
