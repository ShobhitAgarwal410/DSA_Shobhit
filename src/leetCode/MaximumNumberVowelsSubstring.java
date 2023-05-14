package leetCode;

public class MaximumNumberVowelsSubstring {

	public static void main(String[] args) {
		int answer = maxVowels2("leetcode", 3);
		System.out.println("Answer " + answer);
	}

	public static int maxVowels(String s, int k) {
		int count = 0, c = 0, l = s.length();
		for (int i = 0; i <= l - k; i++) {
			c = 0;
			for (int j = i; j < i + k; j++) {
				if (isVowel(s.charAt(j))) { 
					c++;
				}
			}
			if (c == k)
				return c;
			count = c > count ? c : count;
		}

		return count;
	}

	public static int maxVowels2(String s, int k) {
		int vowel = 0;
		for (int i = 0; i < k; i++)
			if (isVowel(s.charAt(i)))
				vowel++;
		int max = vowel;
		for (int i = k; i < s.length(); i++) {
			if (isVowel(s.charAt(i)))
				vowel++;
			if (isVowel(s.charAt(i - k)))
				vowel--;
			max = Math.max(max, vowel);
		}
		return max;
	}

	private static boolean isVowel(char c) {
		if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
			return true;
		return false;
	}

}