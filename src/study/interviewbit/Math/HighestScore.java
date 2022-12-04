package study.interviewbit.Math;

import java.util.ArrayList;
import java.util.HashMap;

public class HighestScore {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		ArrayList<String> a3 = new ArrayList<String>();
		ArrayList<String> a4 = new ArrayList<String>();
		a1.add("BOB");
		a1.add("90");
		a2.add("BOB");
		a2.add("80");
		a3.add("ALICE");
		a3.add("90");
		a4.add("ALICE");
		a4.add("10");
		ArrayList<ArrayList<String>> A = new ArrayList<ArrayList<String>>();
		A.add(a1);
		A.add(a2);
		A.add(a3);
		A.add(a4);
		highestScore(A);
	}

	public static int highestScore(ArrayList<ArrayList<String>> A) {
		int avg = 0;
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<String, Integer> frequencyMap = new HashMap<>();
		for (ArrayList<String> student : A) {
			if (map.containsKey(student.get(0))) {
				map.put(student.get(0), Integer.parseInt(student.get(1)) + map.get(student.get(0)));
				frequencyMap.put(student.get(0), frequencyMap.get(student.get(0)) + 1);
			} else {
				map.put(student.get(0), Integer.parseInt(student.get(1)));
				frequencyMap.put(student.get(0), 1);
			}
		}
		for (String name : map.keySet()) {
			avg = map.get(name) / frequencyMap.get(name) > avg ? map.get(name) / frequencyMap.get(name) : avg;
		}
		return avg;
	}

}
