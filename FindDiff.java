package prac;

public class FindDiff {
	
	public static void main(String[] args) {
		
    System.out.println(findDifference("abcd","abced"));
		
	}
	
	public static char findDifference(String s, String t) {
		int c = 0;
		//t = abcde
		for(char ch : t.toCharArray()) {
			c += ch;
			//adds the ascii values of each char to c
		}
		//s=abcd
		for(char ch : s.toCharArray()) {
			c -= ch;
			//minus the ascii values if each char from c
		}
		
		//now remains the ascii value of only the character that is randomly added so 
		//type cast the int value to char using (char)
				
		return (char) (c);
	}

}
