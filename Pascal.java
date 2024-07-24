package gs;

public class Pascal {
	
	public static void main(String[] args) {
		
		int row=5,col=2;
		System.out.println(getPascall(row,col));
	}
	
	private static int getPascal(int row , int col) {
			 if(col>row)
				{
					return 0;
				}
			 if(row==col||col==0)
			 {
				 return 1;
			 } 
			 int nFact = factorial(row);
			 int rFact = factorial(col);
			 int diffFact = factorial(row-col);
//			 System.out.println(nFact+" "+rFact+" "+diffFact);
			 int value = nFact/(rFact*diffFact);
			 return value;
		}
	private static int factorial(int number) {
		int f = 1;
		for (int i = 1; i <= number; i++) {
			f *= i;
		}
		
		return f;
	}
	private static int getPascall(int row , int col) {
		 if(col>row){
				return 0;}
		 if(row==col||col==0)
		 {	 return 1;
		 }
		 int rFact = factorial(col); 
		 int diff = row-col;
		 int rowvalue = 1;
		for (;row>diff;row--) {
			rowvalue*=row;
		}
		 int value = rowvalue/rFact;
		 return value;
	}

	

}
