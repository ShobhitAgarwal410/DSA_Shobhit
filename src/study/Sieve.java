package study;

import java.util.ArrayList;

public class Sieve {

	public static void main(String[] args) {
		// Find Kth Prime no.
		seive(6);
	}

	static void seive(int k) {
		int max = 9000000;
		ArrayList<Integer> list = new ArrayList<>();

		boolean arr[] = new boolean[max + 1];
		arr[0] = arr[1] = true;
		for (int i = 2; i * i <= max; i++) {
			if (!arr[i]) {
				for (int j = i * i; j <= max; j += i) {
					arr[j] = true;
				}
			}
		}
		for (int i = 2; i <= max; i++) {
			if (!arr[i]) {
				list.add(i);
			}
		}
		System.out.println(list.get(k - 1));
	}

}
