package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterPhoneNumber {

	public static void main(String[] args) {
		LetterPhoneNumber obj = new LetterPhoneNumber();
		List<String> ans = obj.letterCombinations("23");
		System.out.println(ans);
	}

	public List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<>();
		if (digits.isEmpty()) {
			return ans;
		}
		Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");

		backtrack(digits, 0, map, new StringBuilder(), ans);
		return ans;
	}

	private void backtrack(String digits, int i, Map<Character, String> hm, StringBuilder sb, List<String> ans) {
		if (i == digits.length()) {
			ans.add(sb.toString());
			return;
		}
		String current = hm.get(digits.charAt(i));
		for (int j = 0; j < current.length(); j++) {
			sb.append(current.charAt(j));
			backtrack(digits, i + 1, hm, sb, ans);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

}
