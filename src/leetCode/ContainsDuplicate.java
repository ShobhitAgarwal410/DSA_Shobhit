package leetCode;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 1, 5 };
		System.out.println(containsDuplicate(arr));

	}

	public static boolean containsDuplicate(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		HashSet<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (!set.add(i)) {
				return true;
			}
		}
		return false;
	}

}
