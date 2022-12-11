package study.interviewbit.Math;

public class ReverseInteger {

	public static void main(String[] args) {
		int ans = solve(-1146467285);
		System.out.println(ans);
	}

	private static int solve(int A) {
		boolean flag = false;
		if (A < 0) {
			A *= -1;
			flag = true;
		}
		int n = A, rev = 0;
		while (A > 0) {
			rev = rev * 10 + A % 10;
			A /= 10;
		}
		if (rev < 0)
			return 0;
		return flag ? rev * -1 : rev;
	}

}
