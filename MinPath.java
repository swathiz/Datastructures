package gs;

import java.util.Arrays;

public class MinPath {
	
	public static void main(String[] args) {
		int[][] input = {{9,1,4,8}};
//		int[][] input = {{1}}; 
		//{{1}} - chk for it
//		int[][] input = null;
		System.out.println(getMinPath(input));
		
	}
	
	public static int getMinPath(int[][] input) {
		//i[col][row]
		if(input == null) {
			return 0;
		}
		
		if(input.length == 1) {
			return input[0][0];
		}
		int rLength = input.length;
		int cLength = input[0].length;
		
		
		
		for(int i = 1; i<rLength;i++) {
			input[i][0] = input[i-1][0]+input[i][0]; //1 + 3 =4 
		}
		
		for(int j =1;j<cLength;j++) {
			input[0][j] = input[0][j]+input[0][j-1]; // 1  + 1 =2 
		}
		
		for(int i = 1;i<rLength;i++) {
			for(int j =1;j<cLength;j++) {
				input[i][j] = input[i][j]+Math.min(input[i-1][j], input[i][j-1]);
			}
		}
//		System.out.println(Arrays.toString(input[2]));
		return input[rLength-1][cLength-1];
		
	}

}
