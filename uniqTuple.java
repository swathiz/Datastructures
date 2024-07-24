package gs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class uniqTuple {
	public static void main(String[] args) {
		String input = "aabcde";
		int len = 2;
		String uniqueTup = Arrays.toString(getUniqTup(input,len));
		System.out.println(uniqueTup);
	}
	
	public static String[] getUniqTup(String input, int len){

		Set<String> tupleSet = new HashSet<>();
		String[] strArray = new String[tupleSet.size()];
		
		if(input == null||input.length()<len ||input.isBlank()) {
			return tupleSet.toArray(strArray);
		}
	
		for(int i=0;i<=input.length()-len;i++) {
			
			String tuple = input.substring(i,i+len);//t-aa,ab,bc,cd,de,ea,aa
			tupleSet.add(tuple);
			
		}
		
//		for(int i = 0;i<=input.length();i++) {
//			StringBuilder sb = new StringBuilder();
//			sb.append(input.charAt(i));
//		}
		return tupleSet.toArray(strArray);
	}

}
