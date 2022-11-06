package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClimbingStairs {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(1);
		A.add(3);
		int arr[] = { 54, 5, 68, 68, 94, 39, 52, 84, 4, 6, 53, 68, 1, 39, 7, 42, 69, 59, 94, 85, 53, 10, 66, 42, 71, 92,
				77, 27, 5, 74, 33, 64, 76, 100, 37, 25, 99, 73, 76, 66, 8, 64, 89, 28, 44, 77, 48, 24, 28, 36, 17, 49,
				90, 91, 7 };
		ArrayList<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

		System.out.println(solve(list));
	}

	private static int solve(ArrayList<Integer> A) {
		int sum = A.get(0), i = 0;
		int n = A.size() - 1;
		while (i < n) {
			int stairsLeft = n - i;
			if (stairsLeft > 3) {
				if (A.get(i + 2) + A.get(i + 3) < A.get(i + 3) + A.get(i + 4)) {
					System.out.println("Added- " + A.get(i + 1));
					sum += A.get(i + 1);
					i = i + 1;
				} else {
					System.out.println("Added- " + A.get(i + 2));
					sum += A.get(i + 2);
					i = i + 2;
				}
			} else {
				if (stairsLeft <= 2) {
					System.out.println("Added " + A.get(n));
					sum += A.get(n);
					i = n;
				} else {
					if (A.get(i + 1) < A.get(i + 2)) {
						System.out.println("Added- " + A.get(i + 1));
						sum += A.get(i + 1);
						i = i + 1;
					} else {
						System.out.println("Added- " + A.get(i + 2));
						sum += A.get(i + 2);
						i = i + 2;
					}
				}

			}
		}
		return sum;
	}
}
