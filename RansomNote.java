package prac;

public class RansomNote {
	
	public static void main(String[] args) {
		
		System.out.println(canConstruct("aa","ab"));
		
	}
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
		 for(int i = 0; i < ransomNote.length(); i++) {
			 char c = ransomNote.charAt(i);
			 String s = String.valueOf(c);
			 if(!magazine.contains(s)) {
				 return false;
			 }
		 }
		 
		 return true;
	        
	 }

}
