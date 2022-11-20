package study.interviewbit.Array;

import java.util.ArrayList;

public class MaxMinSum {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(22);
		A.add(6);
		A.add(4);
		A.add(3);
		A.add(6);
		A.add(6);
		A.add(3);
		A.add(2);
		A.add(2);
		A.add(-5);
		A.add(8);
		// return sum of max and MIN element from array
		System.out.println(solve(A));
	}

	public static int solve(ArrayList<Integer> A) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE; 
		for (int i = 0; i < A.size(); i++) {
			if(A.get(i)>max) {
				max = A.get(i);
			}
			if(A.get(i)<min) {
				min = A.get(i);
			}
		}
		return max+min;
	}
}
