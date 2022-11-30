package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(3);
		ArrayList<Integer> B = new ArrayList<>();
		B.add(2);
		B.add(6);
		ArrayList<Integer> C = new ArrayList<>();
		C.add(8);
		C.add(10);
		ArrayList<Integer> D = new ArrayList<>();
		D.add(18);
		D.add(20);
		ArrayList<ArrayList<Integer>> AA = new ArrayList<ArrayList<Integer>>();
		AA.add(A);
		AA.add(B);
		AA.add(C);
		AA.add(D);
		System.out.println(solve(AA));
	}

	public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Collections.sort(A, (a, b) -> (a.get(0)).compareTo(b.get(0)));
		for (int i = 0; i < A.size() - 1; i++) {
			if(A.get(i).get(1)>= A.get(i+1).get(0)) {
				A.get(i+1).set(0, Math.min(A.get(i).get(0), A.get(i+1).get(0)));
				A.get(i+1).set(1, Math.max(A.get(i).get(1), A.get(i+1).get(1)));
			}
			else {
				ans.add(A.get(i));
			}
		}
		ans.add(A.get(A.size()-1));
		return ans;
	}
	
	 public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
			ArrayList<Interval> ans = new ArrayList<Interval>();
			Collections.sort(intervals, (a, b) -> ((Integer)a.start).compareTo((Integer)b.start));
			for (int i = 0; i < intervals.size() - 1; i++) {
				if(intervals.get(i).end>=intervals.get(i+1).start) {
					intervals.get(i+1).start = Math.min(intervals.get(i).start, intervals.get(i+1).start);
	                intervals.get(i+1).end = Math.max(intervals.get(i).end, intervals.get(i+1).end);
				}
				else {
					ans.add(intervals.get(i));
				}
			}
			ans.add(intervals.get(intervals.size()-1));
			return ans;
	    }

}
