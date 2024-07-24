package gs;


import java.util.*;

public class Pangram {
    public static void main(String[] args) {
      String input = "The quick brown fox jumps";
//      input = input.toLowerCase();
      
      String op = chkPangram(input);
      System.out.println(op);
      
  }
    
   public static String chkPangram(String input) {
	   LinkedHashSet<Character> missingChars = new LinkedHashSet<>();
	   
	   if( input == null) {
		   return "0";
	   }
	   input = input.toLowerCase();
	      for (char ch = 'a';ch<='z';ch++){
	        missingChars.add(ch);
	      }
	      for (char ch:input.toCharArray()){
	    	
	        if(missingChars.contains(ch)){
	          missingChars.remove(ch);
	        }
	      }
	      
	      //time complexity of any method in hashmap/hashset is O(1)
	      StringBuilder sb = new StringBuilder();
	      for (char ch:missingChars){
		       sb.append(ch);
		      }
	      return sb.toString();
	     
	   
   }
}

