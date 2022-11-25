package study.interviewbit.Array;

import java.util.ArrayList;

public class MaxUnsortedSubArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(1);
		A.add(10);
		A.add(10);
		A.add(15);
		A.add(10);
		A.add(15);
		A.add(10);
		A.add(10);
		A.add(15);
		A.add(10);
		A.add(15);
		solve(A);
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		int n = A.size();
		int s = -1, e = -1;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < n - 1; i++) {
			if (A.get(i) > A.get(i + 1)) {
				s = i;
				break;
			}
		}
		if (s == -1) {
			ans.add(-1);
			return ans;
		}
		for (int i = n - 1; i >= 0; i--) {
			if (A.get(i) < A.get(i - 1)) {
				e = i;
				break;
			}
		}
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = s; i <= e; i++) {
			min = A.get(i) < min ? A.get(i) : min;
			max = A.get(i) > max ? A.get(i) : max;
		}
		for (int i = 0; i < s; i++) {
			if (A.get(i) > min) {
				s = i;
				break;
			}
		}
		for (int i = n - 1; i > e; i--) {
			if (A.get(i) < max) {
				e = i;
				break;
			}
		}
		ans.add(s);
		ans.add(e);
		return ans;
	}

}
