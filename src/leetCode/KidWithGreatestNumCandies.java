package leetCode;

import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestNumCandies {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 3 };
		kidsWithCandies(arr, 3);
	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int max = 0;
		for (int i : candies) {
			if (i > max) {
				max = i;
			}
		}
		for (int j = 0; j < candies.length; j++) {
			result.add(candies[j] + extraCandies >= max);
		}
		return result;
	}

}
