package study.interviewbit.Math;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(20);
	}

	public static ArrayList<String> fizzBuzz(int A) {
		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 1; i <= A; i++) {
			if (i % 15 == 0) {
				ans.add("FizzBuzz");
			} else if (i % 5 == 0) {
				ans.add("Buzz");
			} else if (i % 3 == 0) {
				ans.add("Fizz");
			} else {
				ans.add(Integer.toString(i));
			}
		}
		return ans;
	}

}
