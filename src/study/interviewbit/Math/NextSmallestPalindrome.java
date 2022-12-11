package study.interviewbit.Math;

public class NextSmallestPalindrome {

	public static void main(String[] args) {
		String ans = solve("9999999999");
		System.out.println(ans);

	}

	public static String solve(String A) {
		int n = A.length();
		if (n == 1) {
			if (A.equals("9")) {
				return "11";
			} else {
				return String.valueOf(Integer.parseInt(A) + 1);
			}
		}
		StringBuilder a = new StringBuilder(A);
		String ss = "";
		// check Palindrome
		if (reverseString(A).equals(A)) {
			ss = addOne(a);
		} else {
			ss = A;
		}
		n = ss.length();
		// String length even
		if (n % 2 == 0) {
			int mid = n / 2;
			String left = ss.substring(0, mid);
			String right = ss.substring(mid);
			StringBuilder sbLeft = new StringBuilder(left);
			// check reverse of left half is greater than right
			if (isGreater(sbLeft.reverse().toString(), right)) {
				return left + sbLeft;
			} else {
				StringBuilder sb1 = sbLeft.reverse();
				// if not then increase left by 1
				left = addOne(sb1);
				return left + reverseString(left);
			}
		} else {
			// length if string is odd
			int mid = n / 2;
			String left = ss.substring(0, mid);
			String right = ss.substring(mid + 1);
			StringBuilder sbLeft = new StringBuilder(left);
			// check reverse of left half is greater than right
			if (isGreater(sbLeft.reverse().toString(), right)) {
				return left + ss.charAt(mid) + sbLeft;
			} else {
				// if not, we will increase the mid element
				// if mid element is less than 9
				if (ss.charAt(mid) != '9') {
					char ch = (char) (((ss.charAt(mid) - '0') + 1) + '0');
					return left + ch + reverseString(left);
				} else {
					// if mid element is 9, then we will increase left with mid by 1
					String leftPlusMid = ss.substring(0, mid + 1);
					StringBuilder sbleftMid = new StringBuilder(leftPlusMid);
					String leftPlusMidPlusOne = addOne(sbleftMid);
					String newLeft = leftPlusMidPlusOne.substring(0, leftPlusMidPlusOne.length() - 1);
					return leftPlusMidPlusOne + reverseString(newLeft);
				}

			}
		}

	}

	private static String addOne(StringBuilder A) {
		A.reverse();
		String str = "";
		int count = 0;
		for (int i = 0; i < A.length(); i++) {
			if (i == 0) {
				int digit = ((A.charAt(i) - '0') + 1) % 10;
				str += (char) (digit + '0');
				count = ((A.charAt(i) - '0') + 1) / 10;
			} else {
				int digit = ((A.charAt(i) - '0') + count) % 10;
				str += (char) (digit + '0');
				count = ((A.charAt(i) - '0') + count) / 10;
			}
		}
		if (count == 1) {
			str += "1";
		}
		return reverseString(str);
	}

	private static boolean isGreater(String A, String B) {
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) > B.charAt(i)) {
				return true;
			} else if (A.charAt(i) < B.charAt(i)) {
				return false;
			}
		}
		return false;
	}

	private static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
