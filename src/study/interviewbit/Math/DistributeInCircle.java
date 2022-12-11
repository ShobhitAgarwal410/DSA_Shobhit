package study.interviewbit.Math;

public class DistributeInCircle {

	public static void main(String[] args) {
		solve(8, 5, 2);
	}

	public static int solve(int A, int B, int C) {
		return (C+A)%B-1;

	}
}
