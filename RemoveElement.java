package prac;

public class RemoveElement {
	
	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(nums,2));
	}
	public static int removeElement(int[] nums, int val) {
//      List<Integer> a = Arrays.asList(nums);
		int n = nums.length;
		int index =0;
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] == val) {
				n--;
			}
		}
		
		return n;
    }

}
