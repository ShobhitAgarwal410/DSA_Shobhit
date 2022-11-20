package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.List;

public class RepeatMissingNumArray {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(5);
		A.add(6);
		repeatedNumber(A);
	}

	public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
		long sum = 0, squareArraySum = 0;
		long n = A.size();
		long sumOfN = (n * (n + 1)) / 2;
		long sumofSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
		for (int i = 0; i < n; i++) {
			sum += (long) A.get(i);
			squareArraySum += (long) A.get(i) * (long) A.get(i);
		}
		long missingMinusRepeat = sumOfN - sum;
		long repeatPlusMissing = (sumofSquareN - squareArraySum) / missingMinusRepeat;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ans.add((int) (repeatPlusMissing - missingMinusRepeat) / 2);
		ans.add((int) (repeatPlusMissing + missingMinusRepeat) / 2);
		return ans;
	}
}
