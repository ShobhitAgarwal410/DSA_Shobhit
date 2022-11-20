package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralOrder3 {

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
		ArrayList<Integer> AA = new ArrayList<Integer>();
		AA.add(1);
		AA.add(2);
		AA.add(3);
		AA.add(4);
		AA.add(5);
		AA.add(6);
		AA.add(7);
		AA.add(8);
		AA.add(9);
		spiralOrder(3);
	}

	public static ArrayList<ArrayList<Integer>> spiralOrder(int A) {
		ArrayList<Integer> AA = new ArrayList<Integer>();
		for (int i = 0; i < A * A; i++) {
			AA.add(i + 1);
		}
		int rows = 0, rowe = A - 1, cols = 0, cole = A - 1;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < A; j++) {
				list.add(0);
			}
			ans.add(list);
		}
		int index = 0;
		while (rows <= rowe && cols <= cole && index < A * A) {
			for (int i = cols; i <= cole; i++) {
				ans.get(rows).set(i, AA.get(index));
				index++;
			}
			rows++;
			for (int i = rows; i <= rowe; i++) {
				ans.get(i).set(cole, AA.get(index));
				index++;
			}
			cole--;
			for (int i = cole; i >= cols; i--) {
				ans.get(rowe).set(i, AA.get(index));
				index++;
			}
			rowe--;
			for (int i = rowe; i >= rows; i--) {
				ans.get(i).set(cols, AA.get(index));
				index++;
			}
			cols++;
		}
		return ans;
	}

}
