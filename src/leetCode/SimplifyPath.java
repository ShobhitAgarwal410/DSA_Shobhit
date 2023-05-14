package leetCode;

import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		String ans = simplifyPath("/home/foo/./../");
		System.out.println(ans);
	}

	private static String simplifyPath(String path) {
		Stack<String> st = new Stack<>();
		String current = "";
		for (int i = 0; i < path.length(); i++) {
			char ch = path.charAt(i);
			if (ch == '/') {
				if (i != path.length() - 1 && path.charAt(i + 1) == '/') {
					i++;
				}
				if (current.equals("..") && !st.isEmpty()) {
					st.pop();
				} else if (!current.equals("") && !current.equalsIgnoreCase(".")) {
					st.push(current);
				}
				current = "";

			} else {
				current += ch;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (String c : st) {
			sb.append("/");
			sb.append(c);
		}
		return sb.toString();
	}

}
