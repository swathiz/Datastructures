package gs;

import java.util.Collections;
import java.util.PriorityQueue;

public class Nminimum {
	
    public static void main(String[] args) {
        int[] input = {3,9,8,5,4,7};
        System.out.println(getSecondMin(input));
    }
    
    public static int getSecondMin(int[] input){
        if(input == null || input.length <=1){
            return 0;
        }
        int n = 2;
        PriorityQueue<Integer> Queue = new PriorityQueue<Integer>(Collections.reverseOrder());
//        System.out.println(Queue);
        
  //while adding to the queue it will chck if the top ele is > the going to be inserted
  // element which is greater it ll remove and keep the small element
  //space complexity O(1)
        for(int i =0;i<input.length;i++){
            Queue.add(input[i]);
            System.out.println(Queue);
            if(Queue.size()>n){
                Queue.remove();
            }
        }
        
        return Queue.peek();
    }

}
