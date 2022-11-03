package study.interviewbit.Array;

import java.util.ArrayList;

public class PickFromBothSides {

	public static void main(String[] args) {

	}

	public int solve(ArrayList<Integer> A, int B) {
		int n = A.size();
		int i = 0, j = n;
		int c1 = 0, c2 = 0;
		while (i <= B && j >= n - B) {
			c1 += A.get(i);
			i++;
			c2 += A.get(j);
			j--;
		}

		return c1 > c2 ? c1 : c2;
	}
}
