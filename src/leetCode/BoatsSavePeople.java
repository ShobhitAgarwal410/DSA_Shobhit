package leetCode;

import java.util.Arrays;

public class BoatsSavePeople {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2 };
		numRescueBoats(arr, 5);
	}

	public static int numRescueBoats(int[] people, int limit) {
		int boatCount = 0;
		Arrays.sort(people);
		int left = 0;
		int right = people.length - 1;
		while (left <= right) {
			int sum = people[left] + people[right];
			if (sum <= limit) {
				boatCount++;
				left++;
				right--;
			} else {
				boatCount++;
				right--;
			}
		}
		return boatCount;
	}

}
