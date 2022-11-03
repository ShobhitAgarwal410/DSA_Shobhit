package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NumberOccurence {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(6);
		A.add(4);
		A.add(3);
		A.add(6);
		A.add(6);
		A.add(3);
		A.add(2);
		A.add(2);
		A.add(5);
		A.add(8);
		A.add(1);
		A.add(6);
		A.add(7);
		A.add(4);
		A.add(7);
		A.add(4);
		A.add(2);
		A.add(8);
		A.add(1);

		A.add(0);
		A.add(-1);
		A.add(0);
		A = findOccurences(A);
		for (int i : A) {
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < A.size(); i++) {
			if (map.containsKey(A.get(i))) {
				map.put(A.get(i), map.get(A.get(i)) + 1);
			} else {
				map.put(A.get(i), 1);
			}
		}
		// return the vaues with smallest number occurrence first
		// as -1 comes 1, 0 comes 3, 1 comes 2 ...
		ArrayList<Integer> sortedKeys = new ArrayList<Integer>(map.keySet());
		ArrayList<Integer> ans = new ArrayList<Integer>();

		Collections.sort(sortedKeys);
		for (int x : sortedKeys) {
			ans.add(map.get(x));
		}
		return ans;
	}

}
