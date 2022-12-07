package study.interviewbit.Math;

import java.util.ArrayList;

public class PrimeSum {

	public static void main(String[] args) {
		primesum(100);
	}

	public static ArrayList<Integer> primesum(int A) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int half1 = 1, half2 = A - 1;
		int sum = 0;
		while (sum != A) {
			if (prime(half1) && prime(half2)) {
				answer.add(half1);
				answer.add(half2);
				sum = half1 + half2;
			} else {
				half1++;
				half2--;
			}
		}
		return answer;
	}

	private static boolean prime(int n) {

		if (n == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
