package gs;

import java.util.Arrays;

public class Robot {
	
	public static void main(String[] args) {
		String path ="UDRR";
		
		int[] finalcoord = findFinalCoord(path);
		System.out.println(Arrays.toString(finalcoord));
	}
	
	public static int[] findFinalCoord(String path) {
		int x = 0;
		int y = 0;
		
		if(path == null || path.isBlank()) {
			return new int[] {0,0};
		}
		path = path.toUpperCase();
		for (char move :path.toCharArray()) {
			switch(move) {
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'L':
				x--;
				break;
			case 'R':
				x++;
				break;
			default:
				break;
				
				}}
		int[] finalcoordinates = {x,y};
		return finalcoordinates;
	}
 
}
