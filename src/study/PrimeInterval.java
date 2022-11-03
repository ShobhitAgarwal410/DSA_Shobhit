package study;

public class PrimeInterval {

	public static void main(String[] args) {
		// we need to print prime no. possible within given range
		primeInterval(2, 10);

	}

	private static void primeInterval(int begin, int end) {
		while (begin <= end) {
			if (checkPrime(begin)) {
				System.out.println(begin);
			}
			begin++;  
		}
	}

	private static boolean checkPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
