package study.interviewbit.Array;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(0);
		A.add(-1);
		A.add(0);
		A = maxset(A);
		for (int i : A) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		long max = 0, sum = 0;
		int right = 0, left = 0, ansLeft = -1, ansRight = -1;
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) >= 0) {
				sum += A.get(i);
				if (sum > max || sum == max && ansRight - ansLeft > right - left) {
					max = sum;
					ansLeft = left;
					ansRight = right;
				}
			} else {
				sum = 0;
				left = i + 1;
			}
			right++;
		}
		if (ansLeft == -1) {
			return ans;
		}
		for (int i = ansLeft; i <= ansRight; i++) {
			ans.add(A.get(i));
		}
		return ans;
	}

}
