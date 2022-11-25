package study.interviewbit.Math;

public class IsRectangle {

	public static void main(String[] args) {
		solve(1, 1, 2, 2);
	}

	public static int solve(int A, int B, int C, int D) {

		if (A == B) {
			if (C == D) {
				return 1;
			} else {
				return 0;
			}
		} else if (A == C) {
			if (B == D) {
				return 1;
			} else {
				return 0;
			}
		} else if (A == D) {
			if (B == C) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}

}
