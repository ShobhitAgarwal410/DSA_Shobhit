package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class MakeEqualElementsArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(2);
		A.add(3);
		A.add(1);
		//check if they can be made all equal by B like 2 2 2 
		System.out.println(solve(A, 1));
	}

	public static int solve(ArrayList<Integer> A, int B) {
		Collections.sort(A);
		int lower = A.get(0) - B;
		int greater = A.get(0) + B;

		for (int i = 1; i < A.size(); i++) {
			if (A.get(i) - B == lower || A.get(i) + B == greater || A.get(i) == lower || A.get(i) == greater
					|| A.get(i) + B == lower || A.get(i) - B == greater || A.get(i) == A.get(0)) {
				continue;
			} else {
				return 0;
			}
		}
		return 1;
	}

}
