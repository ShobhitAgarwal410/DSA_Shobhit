package leetCode;

import java.util.Arrays;

public class Successfulpairspellspotions {

	public static void main(String[] args) {
		int[] spells = { 5, 1, 3 };
		int[] potions = { 1, 2, 3, 4, 5 };
		// 9505642132
		// 2147483647
		int answer[] = successfulPairs(spells, potions, 7);
		System.err.println(answer);
	}

	public static int[] successfulPairs(int[] spells, int[] potions, long success) {
		int[] ans = new int[spells.length];
		Arrays.sort(potions);
		for (int s = 0; s < spells.length; s++) {
			int j = 0, potionsSize = potions.length;
			while (j < potionsSize) {
				long product = spells[s] * potions[j];
				if (product >= success) {
					ans[s] = potionsSize - j;
					break;
				} else {
					j++;
				}
			}
		}
		return ans;
	}
}
