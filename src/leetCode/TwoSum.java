package leetCode;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 3,2,4 };
		int target = 6;
		int[] answer = twoSum(arr, target);
		for (int i : answer) {
			System.out.println(i);
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> h = new HashMap<>();
		int ans[] = new int[2];
		for (int i = 0; i <= nums.length; i++) {
			h.put(nums[i], i);
			if (h.containsKey(target - nums[i])) {
				ans[0] = h.get(target - nums[i]);
				ans[1] = i;
				break;
			}
		}

		return ans;
	}
}
