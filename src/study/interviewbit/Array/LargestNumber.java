package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(3);
		A.add(30);
		A.add(34);
		A.add(5);
		A.add(9);
		System.out.println(largestNumber(A)); // 9534330
	}

	public static String largestNumber(final List<Integer> A) {
		if (A.size() == 1)
			return String.valueOf(A.get(0));
		int count = 0;
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < A.size(); i++) {
			list.add(A.get(i) + "");

			if (A.get(i) == 0)
				count++;
		}
		if (count == A.size() || A.isEmpty())
			return "0";
		Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));
		String ans = String.join("", list);
		return ans;
	}

}
