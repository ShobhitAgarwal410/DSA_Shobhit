package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PartitionOfString {

	public static void main(String[] args) {
		partitionString2("abadeasdefddfesasdef");
	}

	public static int partitionString(String s) {
		int count = 1;
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.clear();
				count++;
			}
			map.put(c, 1);
		}
		return count;
	}

	public static int partitionString2(String s) {
		int count = 1, start = 0;
		int[] last_seen = new int[26];
		Arrays.fill(last_seen, -1);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (last_seen[ch - 'a'] >= start) {
				count++;
				start = i;
			}
			last_seen[ch - 'a'] = i;
		}
		return count;
	}

}
