package leetcode;

public class _5_LongestPallindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPallindromicSubstring("baab"));
	}

	/*
	 * https://leetcode.com/problems/longest-palindromic-substring/submissions/ TC :
	 * O(n*n)
	 */
	public static String longestPallindromicSubstring(String s) {
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandFromCenter(s, i, i);
			int len2 = expandFromCenter(s, i, i + 1);

			int len = Math.max(len1, len2);

			if (len > end - start + 1) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}

		}
		return s.substring(start, end + 1);
	}

	private static int expandFromCenter(String s, int i, int j) {
		while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j) ) {
			i--;
			j++;
		}
		return j - i - 1;
	}

	public static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}

}
