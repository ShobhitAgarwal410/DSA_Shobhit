package study.interviewbit.Math;

public class TrailingZderoesInFactorial {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(150));
	}

	public static int trailingZeroes(int A) {
		// (A/5)+ (A/25) + (A/125) + ....+ upto A/5powerx is greater than A
		int count = 0;
		for (int i = 5; i <= A; i = i * 5) {
			int num = A / i;
			count += num;
		}
		return count;
	}

}
