package study.interviewbit.Math;

import java.util.ArrayList;

public class DivisibleBy60 {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(6);
		A.add(3);
		A.add(0);
		A.add(0);
		int ans = divisibleBy60(A);
		System.out.println(ans);
	}

	public static int divisibleBy60(ArrayList<Integer> A) {
//		any number is divisible by 60 if it’s divisible by 6 and 10.
//		means it should divisible by 3 and 2 and contains 0.
//		for 3-> sum of the digits should be divisible by 3
//		for 2-> last digit should be 2 or 4 or 6 or 8 or 0
//		for 10-> last digit should be 0

		int digitSum = 0;
		boolean containEven = false;
		boolean containZero = false;
		if (A.size() == 1 && A.get(0) == 0)
			return 1;
		for (int x : A) {
			if (x == 0)
				containZero = true;
			if (x % 2 == 0 && x != 0)
				containEven = true;
			digitSum += x;
		}
		if (containEven && (digitSum % 3) == 0 && containZero)
			return 1;
		return 0;
	}

}
