package study.interviewbit.Array;

import java.util.ArrayList;

public class GreaterOrLesser {

	public static void main(String[] args) {
		// return max of (no.s greater than c in A, no.s lesser than C in B)
	}

	public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
		int c1 = 0, c2 = 0, j = 0, k = 0;
		while (j < A.size()) {
			if (A.get(j) > C) {
				c1++;
			}
			j++;
		}
		while (k < B.size()) {
			if (B.get(k) < C) {
				c2++;
			}
			k++;
		}
		return Math.max(c1, c2);
	}
}
