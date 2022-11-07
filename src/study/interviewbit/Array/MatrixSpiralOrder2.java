package study.interviewbit.Array;

import java.util.ArrayList;

public class MatrixSpiralOrder2 {

	public static void main(String[] args) {
		ArrayList<Integer> r1 = new ArrayList<Integer>();
		r1.add(1);
		r1.add(2);
		r1.add(3);
		r1.add(4);
		ArrayList<Integer> r2 = new ArrayList<Integer>();
		r2.add(5);
		r2.add(6);
		r2.add(7);
		r2.add(8);
		ArrayList<Integer> r3 = new ArrayList<Integer>();
		r3.add(9);
		r3.add(10);
		r3.add(11);
		r3.add(12);
		ArrayList<Integer> r4 = new ArrayList<Integer>();
		r3.add(13);
		r3.add(14);
		r3.add(15);
		r3.add(16);
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(r1); // 1 2 3 4
		A.add(r2); // 5 6 7 8
		A.add(r3); // 9 10 11 12
		A.add(r4); // 13 14 15 16
		// Creating Transpose of a Matrix AKA Diagonal Flip
		solve(A);
	}

	public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
		int n = A.size();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = A.get(i).get(j);
				A.get(i).set(j, A.get(j).get(i));
				A.get(j).set(i, temp);
			}
		}
		return A;
	}
}
