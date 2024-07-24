package gs;

import java.util.Arrays;

public class LongSubString {
	public static void main(String[] args) {
	String input = "aaabbbbbccda";
		
		int[] result = longestsubstring(input);
		
//		System.out.println(result[0]+","+result[1]);
		System.out.println(Arrays.toString(result));
	}

	public static int[] longestsubstring(String input){
		if(input==null || input.isEmpty()) return new int[] {-1,0};
		if(input.length() == 1) return new int[] {0,1};
		
		int maxLength = 1;
		int currentLength =1;
		int currentStart = 0;
		int lStart = 0;
		//aaabbbbbccdaaaaaa
		for (int i = 1;i<input.length();i++) {
			if(input.charAt(i)==input.charAt(i-1)) {
				currentLength++;
			}
			else
			{
				if(currentLength>maxLength) {
					maxLength = currentLength;
					lStart = currentStart;
				}
				currentStart = i;
				currentLength = 1;
			}
		}
		if(currentLength > maxLength) {
			lStart = currentStart;
			maxLength = currentLength;
		}
		return new int[] {lStart,maxLength};
	}
	
}
