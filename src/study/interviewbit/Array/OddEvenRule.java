package study.interviewbit.Array;

import java.util.ArrayList;

public class OddEvenRule {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		solve(A, 31, 100);
	}

	public static int solve(ArrayList<Integer> A, int B, int C) {
		int fine = 0;
		boolean even;
		if (B % 2 == 0) {
			even = true;
		} else {
			even = false;
		}
		for (int i = 0; i < A.size(); i++) {
			if (even && A.get(i) % 2 != 0) {
				fine += C;
			} else if (!even && A.get(i) % 2 == 0) {
				fine += C;
			}
		}

		return fine;
	}

}
