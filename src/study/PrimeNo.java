package study;

public class PrimeNo {

	public static void main(String[] args) {
		int arr[] = { 12, 5, 23, 45, 67 };
		for (int i : arr) {
			System.out.println(prime(i));
		}
	}

	static boolean prime(int i) {
		if (i == 1) {
			return false;
		} else {
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
