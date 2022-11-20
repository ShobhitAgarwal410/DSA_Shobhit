package study.interviewbit.Array;

import java.util.ArrayList;

public class SpiralMatrix2 {

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
		r4.add(13);
		r4.add(14);
		r4.add(15);
		r4.add(16);
		ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		A.add(r1); // 1 2 3 4
		A.add(r2); // 5 6 7 8
		A.add(r3); // 9 10 11 12
		A.add(r4); // 13 14 15 16
		ArrayList<ArrayList<Integer>> ans = solve(A);
		System.out.println(ans);
	}

	private static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
		int n = A.size();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		// Upper triangle row fix column iterate
		for (int i = 0; i < n; i++) {
			int row = 0, col = i;
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (col >= 0) {
				list.add(A.get(row).get(col));
				row++;
				col--;
			}
			result.add(list);
		}
		// Lower triangle column fix row iterate
		for (int i = 1; i < n; i++) {
			int row = i, col = n - 1;
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (row < n) {
				list.add(A.get(row).get(col));
				row++;
				col--;
			}
			result.add(list);
		}
		return result;
	}

}
