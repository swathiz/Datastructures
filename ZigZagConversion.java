package prac;

public class ZigZagConversion {
	
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING",4));
		System.out.println();
	}
	
	public static String convert(String s, int numRows) {
		
		int n = s.length();
//		System.out.println(s.length());
		StringBuffer[] arr = new StringBuffer[numRows];
		for(int i = 0;i<numRows;i++) {
			arr[i] = new StringBuffer(); 
		}

		int i = 0;
		while(i<n) {
			for(int j = 0; i<n && j < numRows ; j++) {
//				System.out.println(i);
				arr[j].append(s.charAt(i++));
			}
			
			for(int j = numRows-2; i<n &&j>0;j--) {
				arr[j].append(s.charAt(i++));
			}
			
			
		}
		StringBuilder str = new StringBuilder();
		for(StringBuffer st : arr) {
			str.append(st);
		}
//		System.out.println(str);
		return str.toString();
		
	}

}
