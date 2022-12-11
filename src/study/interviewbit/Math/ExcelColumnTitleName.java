package study.interviewbit.Math;

public class ExcelColumnTitleName {

	public static void main(String[] args) {
		String ans = solve(78);
		System.out.println(ans);

	}

	private static String solve(int A) {
		if (A <= 26) {
			return Character.toString((char) (A - 1 + 'A'));
		} else {
			char c;
			if (A % 26 == 0) {
				c = 'Z';
				return solve((A -26) / 26) + c;

			} else {
				c = (char) ((A % 26 - 1) + 'A');
				return solve(A / 26) + c;

			}
		}
	}

	private static String solveHelper(int A) {
		if (A == 0)
			return "";
		char c = (char) ((A % 26 - 1) % 26 + 'A');
		return solveHelper(A / 26) + c;
	}

}
