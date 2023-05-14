package study.interviewbit.Array;

public class DigitalRoot {

	public static void main(String[] args) {
		System.out.println(solve(25));
	}

	public static int solve(int A) {
		int root = 0;
		if (A <= 9) {
			return A;
		}
		int ans = findRoot(A, root);
		return ans;
	}

	private static int findRoot(int A, int root) {
		while (A > 0) {
			root += A % 10;
			A /= 10;
		}
		if (root > 9) {
			return findRoot(root, 0);
		} else {
			return root;
		}
	}
}
