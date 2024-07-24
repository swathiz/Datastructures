package gs;

public class Stock {
	
	public static void main(String[] args) {
		
		int[] input = {7,1,5,3,6,4};
		System.out.println(getProfit(input));
	}
	
	public static int getProfit(int[] input) {
		
		if(input == null || input.length == 0) {
			return 0;
		}
		
		int buy = Integer.MAX_VALUE;
		int sell =0;
		
		for (int i = 0; i < input.length; i++) {
			buy = Math.min(buy,input[i]);
			sell = Math.max(sell,input[i]-buy);
		}
		return sell;
	}

}
