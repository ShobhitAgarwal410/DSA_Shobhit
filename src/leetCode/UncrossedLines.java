package leetCode;

import java.util.HashMap;
import java.util.Map;

public class UncrossedLines {

	public static void main(String[] args) {
		int ans = maxUncrossedLines(new int[] { 1, 2, 3 }, new int[] { 1, 3, 2 });
		System.out.println(ans);
	}

	public static int maxUncrossedLines(int[] nums1, int[] nums2) {
		Map<String, Integer> hm = new HashMap<>();
		return rec(nums1, 0, nums2, 0, hm);
	}

	private static int rec(int[] A, int i, int[] B, int j, Map<String, Integer> hm) {
		if (i == A.length || j == B.length)
			return 0;
		String key = i + " " + j;
		if (hm.containsKey(key)) {
			return hm.get(key);
		}
		int count = 0;
		if (A[i] == B[j]) {
			count = 1 + rec(A, i + 1, B, j + 1, hm);
		} else {
			count += Math.max(rec(A, i + 1, B, j, hm), rec(A, i, B, j + 1, hm));
		}
		hm.put(key, count);
		return count;
	}

}
