package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		List<Integer> result = getRow(3);
		System.out.println(result);
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		ArrayList<Integer> first = new ArrayList<>();
		first.add(1);
		ans.add(first);
		for (int i = 1; i < numRows; i++) {
			ArrayList<Integer> row = new ArrayList<>();
			for (int j = 0; j <= i; j++) {
				int val = ncrFormula(i, j);
				row.add(val);
			}
			ans.add(row);
		}
		return ans;

	}

	private static int ncrFormula(int n, int r) {
		if (n == 0 || r == 0)
			return 1;
		int sum = 1;

		// Calculate the value of n choose r using the
		// binomial coefficient formula
		for (int i = 1; i <= r; i++) {
			sum = sum * (n - r + i) / i;
		}
		return sum;
	}

	public static List<Integer> getRow1(int rowIndex) {
		List<Integer> ans = new ArrayList<>();
		for (int j = 0; j <= rowIndex; j++) {
			int val = ncrFormula(rowIndex, j);
			ans.add(val);
		}
		return ans;
	}

	public static List<Integer> getRow(int rowIndex) {
		if (rowIndex == 0) {
			return Arrays.asList(1);
		}
		if (rowIndex == 1) {
			return Arrays.asList(1, 1);
		}
		List<Integer> pascalRow = new ArrayList<>(rowIndex + 1);
		while (rowIndex > 0) {
			pascalRow = getPascalRow(pascalRow);
			rowIndex--;
		}
		return pascalRow;
	}

	private static List<Integer> getPascalRow(List<Integer> row) {
		List<Integer> newRow = new ArrayList<>(row.size() + 1);
		newRow.add(1);
		for (int i = 0; i < row.size() - 1; i++) {
			newRow.add(row.get(i) + row.get(i + 1));
		}
		newRow.add(1);
		return newRow;
	}
}
