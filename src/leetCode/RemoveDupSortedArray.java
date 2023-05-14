package leetCode;

import java.util.Arrays;

public class RemoveDupSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDupSortedArray obj = new RemoveDupSortedArray();
		int[] arr = { 1,1,2 };
		obj.removeDuplicates(arr);
	}

	public int removeDuplicates(int[] nums) {
		Arrays.sort(nums);
		int k = 0;
		int length = nums.length;
		int ans[] = new int[length];
		for (int i = 0; i < length-1; i++) {
			if (nums[i] != nums[i + 1]) {
				ans[k] = nums[i];
				k++;
			}
		}
		ans[k] = nums[length-1];
		for (int i = 0; i < ans.length; i++) {
			nums[i] = ans[i];
		}
		for (int a : nums) {
			System.out.print(a+" ");
		}
		return k;
	}

}
