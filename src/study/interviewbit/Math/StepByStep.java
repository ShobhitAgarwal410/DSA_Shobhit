package study.interviewbit.Math;

public class StepByStep {

	public static void main(String[] args) {
		System.out.println(solve(22));
	}

	public static int solve(int A) {
		A = Math.abs(A);
		int count = 0;
		int running_sum = 0;
		while (running_sum < A) {
			count++;
			running_sum += count;
		}
		while ((running_sum - A) % 2 != 0) {
			count++;
			running_sum += count;
		}
		return count;
	}

}
