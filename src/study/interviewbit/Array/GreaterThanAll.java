package study.interviewbit.Array;

import java.util.ArrayList;

public class GreaterThanAll {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(13155);
		A.add(75564);
		A.add(45867);
		A.add(53279);
		A.add(21897);
		A.add(4705);
		A.add(67890);
		A.add(2);
		A.add(-5);
		A.add(8);
		System.out.println(solve(A));
	}

	public static int solve(ArrayList<Integer> A) {
		int count = 1;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.size() - 1; i++) {
			max = A.get(i) > max ? A.get(i) : max;
			if (A.get(i + 1) > A.get(i) && A.get(i + 1) > max) {
				count++;
			}
		}
		return count;
	}
}
