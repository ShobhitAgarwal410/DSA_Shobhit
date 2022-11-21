package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(100);
		A.add(100);
		A.add(100);
		A.add(100);
		A.add(100);
		maximumGap(A);
	}

	public static int maximumGap(final List<Integer> A) {
		int n = A.size();
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		left.add(0, A.get(0));
		right.add(0);
		for (int i = 1; i < n; i++) {
			left.add(i, left.get(i - 1) < A.get(i) ? left.get(i - 1) : A.get(i));
			right.add(0);
		}
		right.set(n - 1, A.get(n - 1));
		for (int i = n - 2; i >= 0; i--) {
			right.set(i, right.get(i + 1) > A.get(i) ? right.get(i + 1) : A.get(i));
		}
		int x = 0, y = 0, ans = 0;
		while (x < n && y < n) {
			if (right.get(y) >= left.get(x)) {
				ans = ans > y - x ? ans : y - x;
				y++;
			} else {
				x++;
			}
		}
		return ans;
	}
}
