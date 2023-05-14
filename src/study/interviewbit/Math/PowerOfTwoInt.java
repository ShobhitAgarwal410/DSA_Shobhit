package study.interviewbit.Math;

public class PowerOfTwoInt {

	public static void main(String[] args) {
//		 int a = solve(216);
//		 System.out.println(a);
		 int b = mySqrt(27);
		 System.out.println(b);

	}

	public static int solve(int A) {
		int p = 0;
		for (int i = 1; i * i <= A; i++) {
			p = (int) (Math.log(A) / Math.log(i));
			if (Math.pow(i, p) == A) {
				return 1;
			}
		}
		return 0;
	}
	
	public static int mySqrt(int x) {
		if(x == 0) {
			return 0;
		}
		if(x > 0 && x < 4) {
			return 1;
		}
        int i = 2;
        while(true) {
            if(i* i <= x) {
                i++;
            } else {
                return i-1;
            }
        }
    }
}
