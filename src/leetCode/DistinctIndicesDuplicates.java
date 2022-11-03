package leetCode;

public class DistinctIndicesDuplicates {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 3, 2, 5 };
		System.out.println(containsNearbyDuplicate(arr, 3));

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		int i = 0, j = 1;
		if (k == 0) {
			return false;
		}
		while (i < nums.length && j < nums.length) {
			if (Math.abs(i - j) < k) {
				if (nums[i] == nums[j]) {
					return true;
				}
				j++;
			} else {
				i++;
			}
		}

		return false;
	}

}
