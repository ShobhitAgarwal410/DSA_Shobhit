package leetCode;

public class zeroFilledSubArrays {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 0, 0 };
		System.out.println(zeroFilledSubarray(arr));
		testing();
	}

	public static long zeroFilledSubarray(int[] nums) {
		long c = 0;
		long j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				j += (c * (c + 1)) >> 1;
				c = 0;
			} else {
				c++;
			}
		}
		if (c > 0) {
			j += (c * (c + 1)) >> 1;
		}
		return j;
	}

	static void testing() {
		int a = 4;
		int b = 8;
		if ((a & 1) == 0) {
			b >>= 1;
		}
		System.out.println(b);
	}
}
