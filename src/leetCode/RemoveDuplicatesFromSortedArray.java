package leetCode;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
//		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int arr[] = {0, 0, 0 , 4};

		int ans = removeDuplicates(arr);
		System.out.println(ans);
	}

	public static int removeDuplicates(int[] nums) {
		int j = 0, i = 1;
		while (i < nums.length) {
			if (nums[j] == nums[i]) {
				i++;
			} else {
				nums[j + 1] = nums[i];
				i++;
				j++;
			}
		}
		return j+1;
	}
}
