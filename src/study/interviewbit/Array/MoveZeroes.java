package study.interviewbit.Array;

import java.util.ArrayList;

public class MoveZeroes {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(3);
		A.add(12);
		perfectPeak(A);
	}

	public static ArrayList<Integer> perfectPeak(ArrayList<Integer> A) {
		int i = 0, k = 0, n = A.size();
		while (i < n) {
			if (A.get(i) != 0) {
				if (i != k)
					A.set(k, A.get(i));
				i++;
				k++;
			} else
				i++;
		}
		while (k < n)
			A.set(k++, 0);
		return A;
	}

}
