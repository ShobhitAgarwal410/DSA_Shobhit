package leetCode;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		int[][] ans = generateMatrix(3);
	}

	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		int top = 0, bottom = n - 1, left = 0, right = n - 1;
		int d = 0, k = 1;

		while (k <= n * n) {
			if (d == 0) {
				for (int i = left; i <= right; i++) {
					result[top][i] = k;
					k++;
				}
				top++;
				d = 1;
			} else if (d == 1) {
				for (int i = top; i <= bottom; i++) {
					result[i][right] = k;
					k++;
				}
				right--;
				d = 2;
			} else if (d == 2) {
				for (int i = right; i >= left; i--) {
					result[bottom][i] = k;
					k++;
				}
				bottom--;
				d = 3;
			} else if (d == 3) {
				for (int i = bottom; i >= top; i--) {
					result[i][left] = k;
					k++;
				}
				left++;
				d = 0;
			}
		}
		return result;
	}

}
