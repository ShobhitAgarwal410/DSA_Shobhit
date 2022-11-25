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
		for (int i = 0; i < n; i++) {
			ans.add(0);
		}
		int prod = 1;
		int mod = (int) Math.pow(10, 9) + 7;
		ArrayList<Integer> prefix = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			prefix.add(0);
		}
		ArrayList<Integer> suffix = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			suffix.add(0);
		}
		for (int i = 0; i < n; i++) {
			prod = (prod * A.get(i)) % mod;
			prefix.set(i, prod);
		}
		prod = 1;

		for (int i = n - 1; i >= 0; i--) {
			prod = (prod * A.get(i)) % mod;
			suffix.set(i, prod);
		}
		ans.set(0, suffix.get(1));
		ans.set(n - 1, prefix.get(n - 2));

		for (int i = 1; i < n - 1; i++) {
			long x = suffix.get(i + 1), y = prefix.get(i - 1);
			prod = (int) ((x * y) % mod);
			ans.set(i, prod);
		}
		return ans;
	}
}
