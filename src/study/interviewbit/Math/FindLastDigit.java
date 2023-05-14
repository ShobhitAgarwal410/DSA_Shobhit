package study.interviewbit.Math;

public class FindLastDigit {

	public static void main(String[] args) {
		System.out.println(solve("2", "10"));
	}

	public static int solve(String A, String B) {
		if (A.endsWith("0")) {
			return 0;
		} else if (A.endsWith("1")) {
			return 1;
		} else if (A.endsWith("5")) {
			return 5;
		} else if (A.endsWith("6")) {
			return 6;
		} else if (A.endsWith("2") || A.endsWith("3") || A.endsWith("7") || A.endsWith("8")) {
			int b = Integer.parseInt(B) % 4;
			int a = Character.getNumericValue(A.charAt(A.length() - 1));
			int x = (int) Math.pow(a, b);
			return x % 10;
		} else {
			int b = Integer.parseInt(B) % 2;
			int a = Character.getNumericValue(A.charAt(A.length() - 1));
			int x = (int) Math.pow(a, b);
			return x % 10;
		}
	}

}
