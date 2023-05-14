package leetCode;

import java.util.Stack;

public class ValidateStackSequences {

	public static void main(String[] args) {
		int[] push = { 2, 1, 0 };
		int[] pop = { 1, 2, 0 };
		boolean ans = validateStackSequences(push, pop);
		System.out.println(ans);

	}

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		Stack<Integer> st = new Stack<>();
		int j = 0;
		for (int i : pushed) {
			st.push(i);
			while (!st.isEmpty() && popped[j] == st.peek()) {
				st.pop();
				j++;
			}
		}
		for (int k = j; k < popped.length; k++) {
			if (st.pop() != popped[k]) {
				return false;
			}
		}
		return true;
	}
}
