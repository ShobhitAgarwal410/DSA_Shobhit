package leetCode;

import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		boolean ans = isIsomorphic("badc", "baba");
		System.out.println(ans);
	}

	public static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char d = t.charAt(i);
			if (map.containsKey(c)) {
				if (map.get(c) != d) {
					return false;
				}
			} else {
				if (map.containsValue(d)) {
					return false;
				}
				map.put(c, d);
			}
		}
		return true;
	}

}
