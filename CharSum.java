package gs;

public class CharSum {
	public static void main(String[] args) {
		String i = "aabbaa";
		
		String o = StringCount(i);
		System.out.println(o);
	}
	
	public static String StringCount(String input) {
		
		if( input == null || input.isBlank()) {
			return "invalid string";
		}
	
		input = input.toLowerCase();
		StringBuilder sb = new StringBuilder();
		int count = 1;
	
		for (int i = 0;i<input.length();i++) {

			if(i<input.length()-1 && input.charAt(i) == input.charAt(i+1)) {
				count++;
			}else {
				sb.append(input.charAt(i));
				sb.append(count);
				count = 1;
			}
		}
		return sb.toString();
	}
}
