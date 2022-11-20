package study.interviewbit.Array;

import java.util.ArrayList;

public class BalanceArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(5);
		A.add(2);
		A.add(5);
		A.add(8);
		// return the total count of elements that can be removed such that
		// sum of even index elements equals to odd index elements.
		System.out.println(solve(A));
	}

	public static int solve(ArrayList<Integer> A) {
		int c = 0, sumOdd = 0, sumEven = 0;
		for (int i = 0; i < A.size(); i++) {
			if (i % 2 == 0) {
				sumEven += A.get(i);
			} else {
				sumOdd += A.get(i);
			}
		}
		int sum = sumEven + sumOdd;
		for (int k = 0; k < A.size(); k++) {
			sum -= A.get(k);
			sumOdd = sum - sumOdd;
			sumEven = sum - sumOdd;
			if (sumEven == sumOdd) {
				c++;
			}
			sum += A.get(k);
		}
		return c;
	}

}
