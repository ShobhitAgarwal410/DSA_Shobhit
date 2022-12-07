package study.interviewbit.Math;

public class ExcelColumnNumber {

	public static void main(String[] args) {
		titleToNumber("DE");
	}

	public static int titleToNumber(String A) {
		int n = A.length();
		int ans = 0;
		int p = 0;
		for (int i = n - 1; i >= 0; i--) {
			int c = A.charAt(i);
			int v = c - 64;
			ans += (int) Math.pow(26, p) * v;
			p++;
		}
		return ans;
	}

}
