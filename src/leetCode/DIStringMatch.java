package leetCode;

public class DIStringMatch {

	public static void main(String[] args) {
		int ans[] = diStringMatch("DIDIDIDIDIDIDIDDIIDIDIDIDIIIIIIIIDI");
		System.out.println(ans);
	}

	public static int[] diStringMatch(String s) {
		int n = s.length();
		int a = 0, b = n;
		int ans[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'D') {
				ans[i] = b--;

			} else {
				ans[i] = a++;
			}
		}
		ans[n] = a;
		return ans;

	}

}
