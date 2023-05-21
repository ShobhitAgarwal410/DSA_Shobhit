package leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class GenerateParanthses {

	public static void main(String[] args) {
		List<String> answer = generateParenthesis(5);
		for (String s : answer) {
			System.out.println(s);
		}
	}

	public static List<String> generateParenthesis(int n) {
		Stack<String> stack = new Stack<>();
		List<String> result = new ArrayList<>();
		int open = 0, closed = 0;
		backTrack(open, closed, n, stack, result);

		return result;
	}

	private static void backTrack(int open, int closed, int n, Stack<String> stack, List<String> result) {
		if (n == open && open == closed) {
			result.add(stack.stream().collect(Collectors.joining()));
			return;
		}
		if (open < n) {
			stack.push("(");
			backTrack(open + 1, closed, n, stack, result);
			stack.pop();
		}
		if (closed < open) {
			stack.push(")");
			backTrack(open, closed + 1, n, stack, result);
			stack.pop();
		}
	}
}
