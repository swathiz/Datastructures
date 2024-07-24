package prac;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
	
	public static void main(String[] args) {
//	  int[] input = {1,2,3,1,1,3};
	  int[] input = {1,1,1,1};
	  System.out.println(findGoodPairs(input));
	}

	private static int findGoodPairs(int[] input) {
		int ans = 0;
		Map<Integer,Integer> mp = new HashMap<>();
		for (int i : input) {
			int count = mp.getOrDefault(i,0);
			ans += count;
			mp.put(i,count+1);
		}
		
		return ans;
	}

}
