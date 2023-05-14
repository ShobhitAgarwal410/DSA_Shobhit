package leetCode;

public class QuesWithBrainPower {

	public static void main(String[] args) {
		int arr[][] = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 } };
		long answer = mostPoints(arr);
		System.out.println(answer);
	}

	public static long mostPoints(int[][] questions) {
		int n = questions.length;
		Long ans = 0l;
		long dp[] = new long[n+1];
		for (int i = n - 1; i >= 0; i--) {
			int futureIndex = i + questions[i][1] + 1;
			if (futureIndex >= n) {
				dp[i] = questions[i][0];
			} else {
				dp[i] = questions[i][0] + dp[futureIndex];
			}
			ans = ans > dp[i] ? ans : dp[i];
			dp[i] = dp[i] > dp[i + 1] ? dp[i] : dp[i + 1];
		}
		return dp[0];
	}
}
