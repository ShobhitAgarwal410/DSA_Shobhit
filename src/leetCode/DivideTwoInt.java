package leetCode;

public class DivideTwoInt {

	public static void main(String[] args) {
		divide(-2147483648, -1);
	}

	public static int divide(int dividend, int divisor) {
		if(dividend == Integer.MIN_VALUE) {
			return Integer.MAX_VALUE;
		}
		boolean flag = false;
		if (dividend < 0 && divisor < 0) {
			flag = false;
			dividend = 0 - dividend;
			divisor = 0 - divisor;
		} else if (dividend < 0) {
			flag = true;
			dividend = 0 - dividend;
		} else if (divisor < 0) {
			flag = true;
			divisor = 0 - divisor;
		}

		int q = 0, temp = divisor;
		while (divisor <= dividend) {
			divisor += temp;
			q++;
		}
		if (flag) {
			return 0 - q;
		}
		return q;
	}
//	int r = remainder, a = dividend, q = quotient;
//	for(long i = 0; i < 32; i++){
//        r = (r << 1) | ((a >> (31 - i)) & 1);
//        if(r < b) q <<= 1;
//        else{
//            q = (q << 1) | 1;
//            r -= b;
//        }
//    }

}
