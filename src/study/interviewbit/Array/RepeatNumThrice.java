package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.List;

public class RepeatNumThrice {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(4);
		A.add(3);
		A.add(1);
		A.add(6);
		System.out.println(repeatedNumber(A));
	}

	public static int repeatedNumber(final List<Integer> A) {
		int n = A.size();
		int count1 = 0, count2 = 0, num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (num1 == A.get(i)) {
				count1++;
			} else if (num2 == A.get(i)) {
				count2++;
			} else if (count1 == 0) {
				count1++;
				num1 = A.get(i);
			} else if (count2 == 0) {
				count2++;
				num2 = A.get(i);
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;
		for (int i = 0; i < n; i++) {
			if (num1 == A.get(i)) {
				count1++;
			} else if (num2 == A.get(i)) {
				count2++;
			}
		}
		if (count1 > n / 3)
			return num1;
		if (count2 > n / 3)
			return num2;
		return -1;
	}

}
