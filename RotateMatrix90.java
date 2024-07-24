package gs;

import java.util.Arrays;

public class RotateMatrix90 {
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		matrixRotate90(matrix);
//		System.out.println(3/2);
	}

	public static void matrixRotate90(int[][] matrix) {
		
		tranpose(matrix);
		reverse(matrix);
//		for(int i = 0; i < matrix.length; i++) {
//			for(int j = 0; j < matrix[0].length;j++) {
//				System.out.print(matrix[i][j]+ " ");
//			}
//			System.out.println();
//		}
	
	}
	
	public static int[][] tranpose(int[][] matrix){
		int temp;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = i; j < matrix[0].length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		return matrix;
		
	}
	
	public static int[][] reverse(int[][] matrix){
		for (int i = 0; i < matrix.length ; i++) {
			for (int j = 0;j<matrix[0].length/2;j++) {
				int k = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[i].length - j - 1];
				matrix[i][matrix[i].length - j - 1] = k;
			}
		}
		
		return matrix;
		
	}
	
	

}
 