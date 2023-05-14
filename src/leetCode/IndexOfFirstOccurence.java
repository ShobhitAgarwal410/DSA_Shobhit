package leetCode;

public class IndexOfFirstOccurence {

	public static void main(String[] args) {
		int ans = strStr("mississippi", "odel");
		System.out.println(ans);
	}

	public static int strStr(String haystack, String needle) {
		int n = haystack.length();
		int m = needle.length();
		if (m > n)
			return -1;
		if (m == n) {
			if (needle.equals(haystack)) {
				return 0;
			} else {
				return -1;
			}
		}
		int j = 0;

		for (int i = 0; i < n - m; i++) {
			if (haystack.charAt(i) == needle.charAt(j)) {
				if (j == m - 1)
					return i - m + 1;
				j++;
			} else {
				j = 0;
			}
		}
		return -1;
	}

}
