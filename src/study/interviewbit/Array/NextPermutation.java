package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(4);
		A.add(3);
		A.add(1);
		A = nextPermutation(A);
	}

	private static ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
		// Here we check for no decreasing from end, if yes swapping it with next
		// possible greatest no. and then reversing the left, if not reversing the whole
		// array EG. 1 2 4 3 1 here 1 is greater than 3 then 2 is not for 4 so 2 is the
		// break point.
		// 1 is index no we will swap 2 with 3(next greatest) it will become 1 3 4 2 1,
		// now we will reverse from index so it will become 1 3 1 2 4. this is the ans.
		int n = A.size();
		int index = -1;
		for (int i = n - 1; i > 0; i--) {
			if (A.get(i) > A.get(i - 1)) {
				index = i - 1;
				break;
			}
		}
		if (index == -1) { // if no greatest permutation possible, we reverse the list.
			for (int i = 0; i < n / 2; i++) {
				Collections.swap(A, i, n - i - 1);
			}
			return A;
		}
		int minDiff = Integer.MAX_VALUE, minDiffIndex = -1;
		for (int i = index + 1; i < n; i++) { // finding the greatest possible to swap
			if (A.get(i) > A.get(index) && A.get(i) - A.get(index) < minDiff) {
				minDiff = A.get(i) - A.get(index);
				minDiffIndex = i;
			}
		}
		Collections.swap(A, index, minDiffIndex);
		int k = n - 1; // reversing the remaining elements from right.
		for (int i = index + 1; i < k; i++) {
			Collections.swap(A, i, k);
			k--;
		}
		return A;
	}

}
