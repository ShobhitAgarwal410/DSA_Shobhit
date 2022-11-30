package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class MaxConsecutiveGap {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(10);
		A.add(5);
		A.add(30);
		System.out.println(solve(A));
	}

	public static int solve(ArrayList<Integer> A) {
		int n = A.size(), ans = Integer.MIN_VALUE;
		Collections.sort(A);
		for (int i = 0; i < n-1; i++) {
			ans  = A.get(i+1)-A.get(i) > ans ? A.get(i+1)-A.get(i) : ans;
		}
		return ans;
	}

}
