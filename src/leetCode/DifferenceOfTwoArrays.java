package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2 };
		int arr2[] = { 1, 2, 3, 3 };
		findDifference(arr, arr2);
	}

	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i : nums1) {
			set.add(i);
		}
		List<Integer> list = new ArrayList<>();
		for (int j : nums2) {
			set2.add(j);
			if (!set.contains(j)) {
				list.add(j);
				set.add(j);
			}
		}
		List<Integer> list2 = new ArrayList<>();
		for (int h : nums1) {
			if (!set2.contains(h)) {
				list2.add(h);
				set2.add(h);
			}
		}
		List<List<Integer>> answer = new ArrayList<>();
		answer.add(list2);
		answer.add(list);
		return answer;
	}
}
