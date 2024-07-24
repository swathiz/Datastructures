package gs;

public class Excel {
	
	
	public static void main(String[] args) {
		int columnNumber = 4;
		System.out.println(getExcelColumnName(columnNumber));
	}
	public static String getExcelColumnName(int columnNumber) {
		
		if(columnNumber <= 0) {
			return "invalid input";
		}
		StringBuilder columnName = new StringBuilder();
		
		for(; columnNumber > 0;columnNumber = (columnNumber-1)/26) {
			int rem = (columnNumber-1)%26;
			char c = (char) (rem + 'A');
			columnName.insert(0, c);
		}
		return columnName.toString();
	}

}
