package study.interviewbit.Array;

import java.util.ArrayList;

public class ArrayRotation {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(6);
		rotateArray(A, 5);
	}

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			ret.add(A.get((i + B) % A.size()));
		}
		return ret;
	}

}
