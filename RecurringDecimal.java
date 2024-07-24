package gs;

import java.util.HashMap;
import java.util.Map;

public class RecurringDecimal {
	
	public static void main(String[] args) {
		
		int numerator = -2147483648;
		int denominator = 1;
		System.out.println(getResult(numerator,denominator));
		
	}
	
	public static String getResult(int numerator,int denominator) {
		if(denominator==0) {
			return null;
		}	
		
		StringBuilder result = new StringBuilder(); 
		if((numerator<0 && denominator>0) ||(numerator>0 && denominator<0)) {
			result.append("-");
		}
		numerator = Math.abs(numerator);
		denominator = Math.abs(denominator);
		int d = numerator/denominator; 
		System.out.println(d);
		long reminder = numerator % denominator;
		System.out.println(reminder);
		result.append(d); 
		if(reminder == 0) return result.toString();
		result.append("."); 
		
		Map<Long,Integer> m = new HashMap<>();
		while(reminder>0) {
			if(m.containsKey(reminder)) {
				int pos = m.get(reminder); 
				result.insert(pos, '('); 
				result.append(')');
				return result.toString(); 
			}
			m.put(reminder,result.length()); 
			reminder = reminder*10; 
			result.append(Math.abs(reminder/denominator)); 
			reminder = reminder%denominator; 
			
		}
		//chk with negative
		return result.toString();
		
		
	}

}
