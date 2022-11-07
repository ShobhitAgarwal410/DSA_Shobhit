package study.interviewbit.Array;

import java.util.ArrayList;

public class PythagoreanTriplets {

	public static void main(String[] args) {
		// return count of total triplets exists between given A
		System.out.println(solve(13));
	}

	public static int solve(int A) {
		int c = 0, k;
		ArrayList<Double> list = new ArrayList<Double>();
		for (double j = 1; j <= A; j++) {
			list.add(j);
		}
		for (int i = 1; i < A; i++) {
			for (int j = i; j < A; j++) {
				k = (i * i) + ((j + 1) * (j + 1));
				if (list.contains(Math.sqrt(k))) {
					c++;
				}
			}
		}
		return c;
	}
}
