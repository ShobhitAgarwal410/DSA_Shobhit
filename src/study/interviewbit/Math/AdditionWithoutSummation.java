package study.interviewbit.Math;

public class AdditionWithoutSummation {

	public static void main(String[] args) {
		addNumbers(2, 5);
	}

	public static int addNumbers(int A, int B) {
		for (int i = 0; i < B; i++) {
			A++;
		}
		return A;
	}

}
