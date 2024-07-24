package gs;

import java.util.Collections;
import java.util.PriorityQueue;

public class Mockone {

	    public static void main(String[] args) {
	        int[] input = {-1,-2,3};
	        System.out.println(getSecondMin(input));
	    }
	    
	    public static int getSecondMin(int[] input){
	        if(input == null || input.length <=1){
	            return 0;
	        }
	        int n = 2;
	        PriorityQueue<Integer> Queue = new PriorityQueue<Integer>(Collections.reverseOrder());
	        
	        for(int i =0;i<input.length;i++){
	            Queue.add(input[i]);
	            
	            if(Queue.size()>n){
	                Queue.remove();
	            }
	        }
	        
	        return Queue.peek();
	    }
	}


