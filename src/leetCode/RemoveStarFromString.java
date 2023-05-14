package leetCode;

public class RemoveStarFromString {

	public static void main(String[] args) {
		String ans = removeStars("leet**cod*e");
		System.out.println(ans);
	}

	public static String removeStars(String s) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '*') {
				sb.delete(i - 1, i + 1);
				i -= 2;
			}
		}
		return sb.toString();
	}

}
