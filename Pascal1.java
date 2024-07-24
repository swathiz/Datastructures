package gs;

import java.util.ArrayList;

public class Pascal1 {
	public static void main(String[] args) {
		
		int row=5,col=1;
		System.out.println(getIndex(row,col));
	}

	public static ArrayList<ArrayList<Integer>> getPascal(int n) {
		
		ArrayList<ArrayList<Integer>> pascal = new ArrayList<>();
		pascal.add(new ArrayList<>());
		pascal.get(0).add(1);		
		for(int row = 1; row <=n; row++) {
			ArrayList<Integer> newRow = new ArrayList<>();
			newRow.add(1);
	
			for(int i = 1;i<pascal.get(row-1).size();i++) {
				newRow.add(pascal.get(row-1).get(i-1)+pascal.get(row-1).get(i));
			}
			newRow.add(1);
			pascal.add(newRow);
//			System.out.println(pascal);
		}
		
		return pascal;
	
}
	
	public static int getIndex(int row,int col) {
		
		if(row <= 0) {
			return 0;
		}
		ArrayList<ArrayList<Integer>> p=getPascal(row);
		return p.get(row).get(col);
	}

}





//for the row = 1 index for(i=1;1<1;i++) 1<1 condition fails and it wont go into the loop

