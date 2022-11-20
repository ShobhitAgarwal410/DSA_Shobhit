package study.interviewbit.Array;

public class lcm {

	public static void main(String[] args) {
		System.out.println(solve(8404, 141237625));
	}

	public static Long solve(int A, int B) {
		long a = (long) A;
		long b = (long) B;
		return ((a / gcd(a, b)) * b);
	}

	public static long gcd(long A, long B) {
		if (A == 0) {
			return B;
		} else {
			return gcd(B % A, A);
		}
	}

}
