package study.interviewbit.Math;

public class PalindromeInteger {

	public static void main(String[] args) {
		System.out.println(solve(1241));
	}

	private static int solve(int i) {
		int rev = 0;
		int n = i;
		while (i > 0) {
			rev = rev * 10 + i % 10;
			i /= 10;
		}

		return n == rev ? 1 : 0;
	}

}
