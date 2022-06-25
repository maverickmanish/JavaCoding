package leetcode;

public class _38_CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}

	public static String countAndSay(int n) {
		if (n == 1)
			return "1";
		StringBuilder s = new StringBuilder("1");
		while (n-- > 1) {
			int count = 1, j = 0;
			int length = s.length();
			StringBuilder dummy = new StringBuilder("");
			while (j < length) {
				if (j + 1 < length && s.charAt(j) == s.charAt(j + 1)) {
					count++;
				} else {
					dummy.append(count).append(s.charAt(j));
					count = 1;
				}
				j++;
			}
			s = dummy;
		}
		return s.toString();
	}
}
