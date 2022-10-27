package leetCode;

public class Powerof4 {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(6));
	}

	public static boolean isPowerOfFour(int n) {
		if (n == 1) {
			return true;
		}
		for (int i = 1; i < n / 2; i++) {
			if (Math.pow(4, i) == n) {
				return true;
			}
			else if (Math.pow(4, i) > n) {
				return false;
			}
		}
		return false;
	}
}

