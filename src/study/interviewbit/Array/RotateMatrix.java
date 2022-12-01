package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateMatrix {

	public static void main(String[] args) {
		ArrayList<Integer> r1 = new ArrayList<Integer>();
		r1.add(1);
		r1.add(2);
		r1.add(3);
		ArrayList<Integer> r2 = new ArrayList<Integer>();
		r2.add(5);
		r2.add(6);
		r2.add(7);
		ArrayList<Integer> r3 = new ArrayList<Integer>();
		r3.add(9);
		r3.add(10);
		r3.add(11);
		List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(r1); // 1 2 3
		A.add(r2); // 5 6 7
		A.add(r3); // 9 10 11
		rotateMAtrix(A);
	}

	public static void rotateMAtrix(final List<ArrayList<Integer>> A) {
		int n = A.size();
		//Transpose of matrix
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int temp = A.get(i).get(j);
				A.get(i).set(j, A.get(j).get(i));
				A.get(j).set(i, temp);
			}
		}
		//Reversing in row with n/2 only.
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = A.get(i).get(j);
				A.get(i).set(j, A.get(i).get(n - j - 1));
				A.get(i).set(n - j - 1, temp);

			} // 9 5 1
		}	 // 10 6 2
	}		 // 11 7 3

}
