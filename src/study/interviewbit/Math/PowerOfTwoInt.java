package study.interviewbit.Math;

public class PowerOfTwoInt {

	public static void main(String[] args) {
		solve(216);
	}

	public static int solve(int A) {
		int p = 0;
		for (int i = 1; i * i <= A; i++) {
			p = (int) (Math.log(A) / Math.log(i));
			if (Math.pow(i, p) == A) {
				return 1;
			}
		}
		return 0;
	}
}
