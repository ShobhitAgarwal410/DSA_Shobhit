package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class FirstMissingInteger {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(234);
		A.add(23);
		A.add(23434);
		A.add(534);
		A.add(734);	
		A.add(235);
		A.add(236);
		A.add(344);
		A.add(4);
		A.add(234);
		A.add(234);
		A.add(-9);
		A.add(3);
		int ans = firstMissingPositive(A);
		System.out.println(ans);
	}

	public static int firstMissingPositive(ArrayList<Integer> A) {
		int n = A.size();
		for (int i = 0; i < n; i++) {
			if (A.get(i) > 0 && A.get(i) <= n) {
				if (A.get(A.get(i) - 1) != A.get(i)) {
					Collections.swap(A, A.get(i) - 1, i);
					i--;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (A.get(i) != i + 1) {
				return i + 1;
			}
		}
		return n + 1;
	}

}
