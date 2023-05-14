package leetCode.study75;

public class RunnimgSumArray {

	public static void main(String[] args) {
		int ans[] = { 1, 2, 3, 4 };
		RunnimgSumArray obj = new RunnimgSumArray();
		int a[] = obj.runningSum(ans);
		System.out.println(a);
	}

	public int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i];
		}
		return nums;
	}

}
