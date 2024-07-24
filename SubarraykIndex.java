package gs;

public class SubarraykIndex {
	
	public static void main(String[] args) {
		
		int[] input = {1,1,1,1,1};
		int target = 3;
		System.out.println(getCount(input,target));
		
		
	}
	
	public static int getCount(int[] input,int target) {
		int count=0;
		for (int i = 0; i < input.length; i++) {
			int sum=0;
			for (int j = i; j <input.length; j++) {
					sum+=input[j];
					if(sum==target){
						count++;
					}
			}

		}
		return count;
	}
	
	

}
