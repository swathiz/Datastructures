package gs;

import java.util.LinkedList;
import java.util.Queue;

public class CircleGame {
	
	public static void main(String[] args) {
		int n = 6;
		int k = 2;
		System.out.println(2%5);
		System.out.println(win(n,k));
	}
	
	public static int win(int n,int k) {
		
		if(n==0 || k==0) {
			return 0;
		}
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i<=n;i++) {
			q.add(i);
		}
		while(q.size()>1) {
			for(int i =1;i<k;i++) {

				q.add(q.poll());
			}
			q.poll();

		}
		return q.poll();
	}

}
