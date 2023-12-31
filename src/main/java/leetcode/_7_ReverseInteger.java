package leetcode;

public class _7_ReverseInteger {

	public static void main(String[] args) {

		System.out.println(reverse(-1534236469));

	}

	/*
	 * Integer.MAX_VALUE (2147483647) % 10 is equivalent to 7 Integer.MIN_VALUE
	 * (-2147483648) % 10 is equivalent to -8
	 * Complexity Analysis
		Time Complexity: O(log(x)). There are roughly log 10(x) digits in x.
		Space Complexity: O(1).
	 */
	public static int reverse(int x) {
		int rev = 0,i = Integer.MAX_VALUE / 10,j = Integer.MIN_VALUE / 10,digit;
		while (x != 0) {
			digit  = x % 10;
			x /= 10;

			if (rev > i || (rev == i && digit > 7))
				return 0;

			if (rev < j || (rev == j && digit < -8))
				return 0;

			rev = rev * 10 + digit;
		}

		return rev;
	}
}
