package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern209 {

	public static void main(String[] args) {
		// abba -> dog cat cat dog
		WordPattern209 obj = new WordPattern209();
		System.out.println(obj.wordPattern("abba", "dog dog dog dog"));

	}

	public boolean wordPattern(String pattern, String s) {
		HashMap<Character, String> map = new HashMap<>();
		char[] arr = pattern.toCharArray();
		Set<String> word_set = new HashSet<String>();
		Set<Character> pattern_set = new HashSet<Character>();
		String[] words = s.split("\\s+");
		for (String word : words)
			word_set.add(word);
		for (char c : pattern.toCharArray())
			pattern_set.add(c);
		if (words.length != pattern.length() || word_set.size() != pattern_set.size())
			return false;

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				if (map.containsValue(words[i])) {
					return false;
				}
				map.put(arr[i], words[i]);
			} else {
				if (!map.get(arr[i]).equalsIgnoreCase(words[i])) {
					return false;
				}
			}
		}
		return true;
	}

}
