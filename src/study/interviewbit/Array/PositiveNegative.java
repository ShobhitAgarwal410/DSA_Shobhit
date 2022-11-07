package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class PositiveNegative {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(2);
		A.add(1);
		A.add(0);
		A.add(3);
		ArrayList<Integer> ans1 = new ArrayList<Integer>();
		ans1 = solve(A);
		for (int i : ans1) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = 0, j = 0, k = 0;
		while (j < A.size()) {
			if (A.get(j) > 0) {
				i++;
			} else if (A.get(j) < 0) {
				k++;
			}
			j++;
		}
		ans.add(i);
		ans.add(k);
		return ans;
	}
}
