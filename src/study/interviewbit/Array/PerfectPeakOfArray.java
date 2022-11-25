package study.interviewbit.Array;

import java.util.ArrayList;

public class PerfectPeakOfArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(5);
		A.add(1);
		A.add(4);
		A.add(4);
//		A.add(6);
//		A.add(8);
//		A.add(10);
//		A.add(7);
//		A.add(9);
		System.out.println(perfectPeak(A));
	}

	public static int perfectPeak(ArrayList<Integer> A) {
		int n = A.size();
		ArrayList<Integer> lesser = new ArrayList<>();
		ArrayList<Integer> greater = new ArrayList<>();
		lesser.add(A.get(0));
		greater.add(A.get(n - 1));
		int max = A.get(0);
		int min = A.get(n - 1);
		for (int i = 1; i < n; i++) {
			max = A.get(i) > max ? A.get(i) : max;
			lesser.add(max);
			greater.add(i);
		}
		for (int i = n - 1; i > 0; i--) {
			min = A.get(i) < min ? A.get(i) : min;
			greater.set(i - 1, min);
		}
		for (int i = 1; i < n; i++) {
			if (A.get(i) > lesser.get(i - 1) && A.get(i) < greater.get(i)) {
				return 1;
			}
		}
		return 0;
	}
}
