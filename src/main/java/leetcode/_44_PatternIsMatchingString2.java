package leetcode;

/*In the pattern matching, we've use memoization to optimize the time complexity

currently, it's O ( s's length * p's length)
*/

public class _44_PatternIsMatchingString2 {

	static Boolean[][] memoization;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isMatch("ab", ".*"));

	}

	public static boolean isMatch(String s, String p) {
		memoization = new Boolean[s.length() + 1][p.length() + 1];
		return match(0, 0, s, p);
	}

	private static boolean match(int i, int j, String s, String p) {
		if (j == p.length())
			return i == s.length();
		if (i == s.length()) {
			for (int index = j; index < p.length(); index++) {
				if (p.charAt(index) != '*')
					return false;
			}
			return true;
		}

		if (memoization[i][j] != null)
			return memoization[i][j];
		boolean ans = false;

		if (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)) {
			ans = match(i + 1, j + 1, s, p);
		} else if (p.charAt(j) == '*')
			ans = match(i + 1, j + 1, s, p) || match(i, j + 1, s, p) || match(i + 1, j, s, p);
		memoization[i][j] = ans;
		return ans;
	}

}
