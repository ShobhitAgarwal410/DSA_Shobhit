package study.interviewbit.Math;

public class SumOf7Multiple {

	public static void main(String[] args) {
		solve(99, 115);
	}

	public static Long solve(int A, int B) {
		long x = A / 7;
		if (A % 7 == 0)
			x--;
		long y = B / 7;
		long sum = y * (y + 1) / 2 - x * (x + 1) / 2;
		return sum * 7;
	}

}
