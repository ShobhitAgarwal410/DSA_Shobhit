package study.interviewbit.Array;

import java.util.ArrayList;

public class PickFromBothSides {

	public static void main(String[] args) {
		// find max possible sum by picking max k numbers from both end
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(3);
		A.add(-1);
		A.add(4);
		A.add(2);
		System.out.println("ans");
		System.out.println(solve(A, 3));
	}

	public static int solve(ArrayList<Integer> A, int B) {
		int n = A.size();
		int sum = 0, nsum = 0, min;
		for (int i = 0; i < n; i++) {
			sum += A.get(i);
		}
		int j = n - B;
		for (int i = 0; i < n - B; i++) {
			nsum += A.get(i);
		}
		min = nsum;
		int k = 0;
		while (j <= n - 1) {
			nsum = nsum + A.get(j) - A.get(k);
			min = min > nsum ? nsum : min;
			k++;
			j++;
		}
		return sum - min;
	}
}
