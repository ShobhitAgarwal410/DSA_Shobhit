package study.interviewbit.Array;

import java.util.ArrayList;

public class PangramCheck {

	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>();
//		A.add("the");
//		A.add("quick");
//		A.add("brown");
//		A.add("fox");
//		A.add("jumps");
//		A.add("over");
//		A.add("the");
//		A.add("lazy");
//		A.add("dog");
		A.add("interviewbit");
		A.add("scaler");
		System.out.println(solve(A));
	}

	private static int solve(ArrayList<String> A) {
		int arr[] = new int[26];
		for (String s : A) {
			for (int i = 0; i < s.length(); i++) {
				int ascii = s.charAt(i);
				arr[ascii - 97] = 1;
			}
		}
		for (int i=0;i<arr.length;i++) {
			if (arr[i] != 1) {
				return 0;
			}
		}
		return 1;
	}

}
