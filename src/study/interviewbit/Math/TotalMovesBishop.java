package study.interviewbit.Math;

public class TotalMovesBishop {

	public static void main(String[] args) {

		solve(4, 4);
	}

	public static int solve(int A, int B) {
		return Math.min(B - 1, A - 1) + Math.min(8 - B, A - 1) + Math.min(8 - B, 8 - A) + Math.min(B - 1, 8 - A);

	}

}
