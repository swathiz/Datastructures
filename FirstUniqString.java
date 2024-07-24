package gs;

public class FirstUniqString {
	 public static char firstUniqChar(String s) {
	        int[] charCount = new int[26];
	        
	        if( s==null || s.isBlank()) {
	        	return '0';
	        }

	        for (int i=0; i<s.length();i++){
	            char c = s.charAt(i);
	            charCount[c-'a']++;
	        }
	         for (int i =0;i<s.length();i++){
	             char c = s.charAt(i);
	             if (charCount[c-'a']==1){
	                 return c;
	             }
	         }
	        return '0';      
	    }

	    public static void main(String args[]){
	        String in = "ccbbad";
	        char result = firstUniqChar(in);
	        System.out.println(result);
	    }
}



