package gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntFromString {
	
	public static void main(String[] args) {
		
		String in = "+";
		System.out.println(getDigit(in));
	}
	
	public static int getDigit(String input) {
		
		int result = 0;
		
		if(input == null || input.isBlank()) {
			return result;
		}
		//Character.isDigit(input.charAt(0))
		
		if(input.length()==1) {
			if(input.charAt(0)=='+'){
				return 0;
			}else if(input.charAt(0)=='-') {
				return 0;
			}else {
				return Integer.parseInt(input);
			}
			
		}
		
		char first = input.charAt(0);
		char sec = input.charAt(1);
		if(Character.isDigit(first)||(first == '-' &&input.length()>1 && Character.isDigit(sec))) {		
			int endIndex=1;
			while(endIndex < input.length() && Character.isDigit(input.charAt(endIndex))) {
				endIndex++;
			}
			String numPart = input.substring(0,endIndex);
			System.out.println(numPart);
			if(numPart.length() > 9) {
                if(numPart.charAt(0) == '-'){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }
			result = Integer.parseInt(numPart);
			
		}
		return result;
		
	}

}
