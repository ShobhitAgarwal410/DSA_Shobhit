package leetCode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 6 };
		int index = searchInsert(arr, 5);
		System.out.println(index);
	}

	public static int searchInsert(int[] nums, int target) {
		int index = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= target) {
				return i;
			}
		}
		return index;
	}
}
