package gs;

public class Chess {
	 public static void main(String[] args) {
		int pawnX = 1, pawnY = 1;
		int bishopX = 5, bishopY = 5;
		
		System.out.println(getResult(pawnX,pawnY,bishopX,bishopY));
	}
	 
	 public static boolean getResult(int pawnX,int pawnY,int bishopX, int bishopY) {
		
		 if(pawnX - bishopX == pawnY-bishopY) {
			 return true;
			
		 } else if(-pawnX + bishopX == pawnY-bishopY) {
			 return true;
		 }else {
			 return false;
		 }
	 }

}
