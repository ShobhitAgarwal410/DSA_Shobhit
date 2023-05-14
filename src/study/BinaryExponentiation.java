package study;

public class BinaryExponentiation {

	public static void main(String[] args) {
		// we need to calculate n power k (n^k)
		System.out.println(optimizedApproach(2, 14));
		System.out.println(naiveApproach(2, 13));
		System.out.println(optimizedApproach(2, 0));

	}

	private static int naiveApproach(int base, int power) {
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result *= base;
		}
		return result;
	}

	private static int optimizedApproach(int base, int power) {
		int result = 1;
		while (power > 0) {
			// if power is even, dividing the power by 2 and incrementing the base by base
			if (power % 2 == 0) {
				base = base * base;
				power = power / 2;
			}
			// if power is odd, decreasing the power by 1 and increasing the result
			else {
				result = result * base;
				power = power - 1;
			}
		}
		return result;
	}
	
	public double myPow(double base, int power) {
		if(base == 1) {
			return 1.00000;
		}
		if(power == Integer.MIN_VALUE) {
			if(base == -1) {
				return 1.00000;
			}
			return 0.00000;
		}
		boolean flag = false;
		if (power < 0) {
			flag = true;
			power = -power;
		}
		double result = 1;
		while (power > 0) {
    // if power is even, dividing the power by 2 and incrementing the base by base
			if (power % 2 == 0) {
				base = base * base;
				power = power / 2;
			} 
    // if power is odd, decreasing the power by 1 and increasing the result
            else {
				result = result * base;
				power = power - 1;
			}
		}
		return flag ? (1 / result) : result;
}

}
