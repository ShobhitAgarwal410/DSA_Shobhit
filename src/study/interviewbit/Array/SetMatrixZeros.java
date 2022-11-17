package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros {

	public static void main(String[] args) {
		ArrayList<Integer> r1 = new ArrayList<Integer>();
		r1.add(0);
		r1.add(0);
		ArrayList<Integer> r2 = new ArrayList<Integer>();
		r2.add(0);
		r2.add(0);
		ArrayList<Integer> r3 = new ArrayList<Integer>();
		r3.add(9);
		r3.add(10);
		r3.add(11);
		r3.add(12);
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(r1); // 1 2 3 4
		A.add(r2); // 5 6 7 8
//		A.add(r3); // 9 10 11 12 }
		setZeroes(A);
		System.out.println(A);

	}

	public static void setZeroes(ArrayList<ArrayList<Integer>> A) {
		int col0 = 1, rows = A.size(), cols = A.get(0).size();
		for (int i = 0; i < rows; i++) {
			if (A.get(i).get(0) == 0) {
				col0 = 0;
			}
			for (int j = 1; j < cols; j++) {
				if (A.get(i).get(j) == 0) {
					A.get(i).set(0, 0);
					A.get(0).set(j, 0);
				}
			}
		}
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 1; j--) {
				if (A.get(i).get(0) == 0 || A.get(0).get(j) == 0) {
					A.get(i).set(j, 0);
				}
			}
			if (col0 == 0) {
					A.get(i).set(0, 0);
			}
		}
	}
}
