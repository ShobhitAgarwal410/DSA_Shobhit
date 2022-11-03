package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralOrder1 {

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
		List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(r1); // 1 2 3 4
		A.add(r2); // 5 6 7 8
		A.add(r3); // 9 10 11 12
		spiralOrder(A);
	}

	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		int rows = A.size();
		int cols = A.get(0).size();
		int T = 0, B = rows - 1, L = 0, R = cols - 1, d = 0;
		ArrayList<Integer> ans = new ArrayList<Integer>();

		while (T <= B && R >= L) {
			if (d == 0) {
				for (int i = L; i <= R; i++) {
					ans.add(A.get(T).get(i));
				}
				T++;
				d = 1;
			} else if (d == 1) {
				for (int i = T; i <= B; i++) {
					ans.add(A.get(i).get(R));
				}
				R--;
				d = 2;
			} else if (d == 2) {
				for (int i = R; i >= L; i--) {
					ans.add(A.get(B).get(i));
				}
				B--;
				d = 3;
			} else if (d == 3) {
				for (int i = B; i >= T; i--) {
					ans.add(A.get(i).get(L));
				}
				L++;
				d = 0;
			}
		}
		return ans;
	}

}
