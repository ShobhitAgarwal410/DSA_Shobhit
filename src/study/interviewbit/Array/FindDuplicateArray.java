package study.interviewbit.Array;

import java.util.ArrayList;

public class FindDuplicateArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(3);
		System.out.println(solve(A));
	}

	public static int solve(ArrayList<Integer> A) {
		int slow = A.get(0), fast = A.get(A.get(0));
		while (slow != fast) {
			slow = A.get(slow);
			fast = A.get(A.get(fast));
		}
		fast = 0;
		while (slow != fast) {
			slow = A.get(slow);
			fast = A.get(fast);
		}
		return slow;

	}
}
