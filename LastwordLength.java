package prac;

public class LastwordLength {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		System.out.println(getLength(s));
		
	}
	
	public static int getLength(String input) {
		
		String[] words = input.split(" ");
		String lastword = words[words.length-1];
		int length = lastword.length();
		
		return length;
	}

}
