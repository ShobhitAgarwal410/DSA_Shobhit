package leetCode;

public class MinmimizeMaxOfArray {

	public static void main(String[] args) {
		int arr[] = {3,7,1,6};
		minimizeArrayValue(arr);
	}

	public static int minimizeArrayValue(int[] nums) {
		// Initialize answer and the prefix sum.
		long answer = 0, prefixSum = 0;

		// Iterate over nums, update prefix sum and answer.
		for (int i = 0; i < nums.length; ++i) {
			prefixSum += nums[i];
			answer = Math.max(answer, (prefixSum + i) / (i + 1));
		}

		return (int) answer;
	}

}
