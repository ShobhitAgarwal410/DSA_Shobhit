package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySum {

	public static void main(String[] args) {
		ArrayList<Integer> r1 = new ArrayList<Integer>();
		r1.add(9);
		r1.add(9);
		r1.add(2);
		r1.add(3);
		r1.add(4);
		ArrayList<Integer> r2 = new ArrayList<Integer>();
		r2.add(5);
		r2.add(6);
		r2.add(7);
		r2.add(8);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = arraySum(r1, r2);
		System.out.println(result);
	}

	private static ArrayList<Integer> arraySum(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int n1 = A.size() - 1;
		int n2 = B.size() - 1;
		int c = 0, d = c;
		int k = n1 > n2 ? n1 : n2;
		while (k >= 0) {
			d += c;
			if (n1 >= 0) {
				d += A.get(n1);
			}
			if (n2 >= 0) {
				d += B.get(n2);
			}
			c = d / 10;
			d %= 10;
			result.add(d);
			d=0;
			n1--;
			n2--;
			k--;
		}
		if (c == 1) {
			result.add(1);
		}
		Collections.reverse(result);
		return result;
	}

}
