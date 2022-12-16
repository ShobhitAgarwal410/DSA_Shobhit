package study.interviewbit.Math;

public class RoundTable {

	public static void main(String[] args) {
		solve(4);
	}

	public static int solve(int A) {
		return (int) ((fact(A) % mod * 2 % mod) % mod);
	}

	static long mod = 1000000007;

	static long fact(long n) {
		if (n == 0)
			return 1;
		return (n % mod * fact(n - 1) % mod) % mod;
	}
}
