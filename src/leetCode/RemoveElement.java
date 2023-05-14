package leetCode;

public class RemoveElement {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 }; // 0 0 1 2 2 2 3 4
		removeElement(arr, 2);
	}

	public static int removeElement(int[] nums, int val) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count++] = nums[i];
			}
		}
		return count;
	}

}
