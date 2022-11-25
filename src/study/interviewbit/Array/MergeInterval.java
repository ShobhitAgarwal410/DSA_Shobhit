package study.interviewbit.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {

	public static void main(String[] args) {
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(6, 9);
		Interval i3 = new Interval(2, 5);
//		Interval i4 = new Interval();
		ArrayList<Interval> A = new ArrayList<Interval>();
		A.add(i1);
		A.add(i2);
		insert(A, i3);
	}

//	public static ArrayList<ArrayList<Integer>> mergeInterval(ArrayList<ArrayList<Integer>> A,
//			ArrayList<Integer> interval) {

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int n = intervals.size();
		ArrayList<Interval> ans = new ArrayList<Interval>();
		int start = newInterval.start, end = newInterval.end;
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			if (intervals.get(i).end < start) {
				ans.add(intervals.get(i));
			} else if (intervals.get(i).start > end) {
				if (!flag) {
					ans.addAll(new ArrayList<Interval>(Arrays.asList(new Interval(start, end))));
					flag = true;
				}
				ans.add(intervals.get(i));
			} else {
				start = intervals.get(i).start < start ? intervals.get(i).start : start;
				end = intervals.get(i).end > end ? intervals.get(i).end : end;

			}
		}
		if (!flag) {
			ans.addAll(new ArrayList<Interval>(Arrays.asList(new Interval(start, end))));
		}
		return ans;
	}

}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}
