package study.interviewbit.Math;

public class MonkeyAndDoor {

	public static void main(String[] args) {
		solve(100);

	}

	private static int solve(int door) {
		int count = 0;
		boolean[] doors = new boolean[101];
		for (int i = 1; i <= door; i++) {
			for (int j = i; j <= door; j += i)
				doors[j] = !doors[j];

		}
		for (int i = 1; i <= 100; i++) {
			if (doors[i]) {
				count++;
			}
		}
		return count;
	}
//
}
