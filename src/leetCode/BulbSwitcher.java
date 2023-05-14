package leetCode;

public class BulbSwitcher {

	public static void main(String[] args) {
		int ans = bulbSwitch(3);
		System.out.println(ans);
	}

	public static int bulbSwitch(int n) {
		int c = 0;
		boolean[] bulbs = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j += i) {
				bulbs[j] = !bulbs[j];
			}
		}
		for (boolean bulb : bulbs) {
			if (bulb) {
				c++;
			}
		}
		return c;
	}

}
