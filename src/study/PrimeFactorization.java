package study;

public class PrimeFactorization {

	public static void main(String[] args) {
		// find prime factors of a no.

		naiveApproach(45);
		optimizedApproach(190463);
	}

	private static void naiveApproach(int n) {

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				int c = 0;
				while (n % i == 0) {
					n /= i;
					c++;
				}
				System.out.println(i + "^" + c);
			}
		}
	}

	private static void optimizedApproach(int n) {

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				int c = 0;
				while (n % i == 0) {
					n /= i;
					c++;
				}
				System.out.println(i + "^" + c);
			}
		}
		// This if condition is true when n becomes prime, there is no other factor left and n becomes less than i square
		if (n > 1) {
			System.out.println(n + "^" + 1);

		}
	}

}
