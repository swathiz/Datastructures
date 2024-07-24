package prac;

public class LongCommonPrefix {
	
	public static void main(String[] args) {
		
		String[] str = {"flower","flow","flight"};
		System.out.println(longCommonPrefix(str));
		
	}
	
	public static String longCommonPrefix(String[] str) {
		String ans= str[0];
		String sub = "";
		
		for(int i = 1; i<str.length;i++) {
			for(int j=0;j<Math.min(ans.length(),str[i].length());j++) {
				if(ans.charAt(j)==str[i].charAt(j)) {
					sub = sub+ans.charAt(j);
				}else {
					break;
				}
			}
			ans = sub;
			sub="";	
		
		}
		
		return ans;
		
		
	}
}
