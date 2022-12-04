package study.interviewbit.Array;

import java.util.ArrayList;

public class ProductOfAll {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		solve(A);
	}

	private static ArrayList<Integer> solve(ArrayList<Integer> A) {
		int n = A.size();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Long> left = new ArrayList<Long>();
		ArrayList<Long> right = new ArrayList<Long>();

		int modP = 1000000007;
		left.add((long) 1);
		right.add((long) 1);

		for (int i = 0; i < n - 1; i++) {
			left.add((left.get(i) * A.get(i)) % modP);
			right.add((long) 1);
		}
		for (int i = n - 1; i >= 1; i--) {
			right.set(i - 1, (A.get(i) * right.get(i)) % modP);
		}
		for (int i = 0; i < n; i++) {
			ans.add((int) (left.get(i) * right.get(i)) % modP);
		}
		return ans;
	}
}
