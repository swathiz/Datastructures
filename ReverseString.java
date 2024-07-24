package prac;

public class ReverseString {
	
	public static void main(String[] args) {
		
//		char[] s = {'h','e','l','l','o'};
		char[] s = {'r','a','n','j','i','t','h','a'};
		System.out.println(reverseStr(s));
	}

	private static char[] reverseStr(char[] s) {
		
		for(int i=0,j=s.length-1;i<s.length/2;i++,j--) {
			char temp = s[i];
			s[i]=s[j];
			s[j]=temp;
		}
		return s;
	}
	
	
}
