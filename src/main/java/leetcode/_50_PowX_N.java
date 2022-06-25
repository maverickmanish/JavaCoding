package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _50_PowX_N {

	public static void main(String[] args) {

	}

	public double myPow(double x, int n) {
		return myPow(x, (long) n);
	}

	public double myPow(double x, long n) {
		if (n == 0)
			return 1;
		if (n < 0)
			return myPow((double) 1 / x, -n);
		return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
	}

	/*
	 * O (log N)
	 * 
	 * Here, (long) prevents the overflow as below:-
	 *  long l = Math.abs((long) n)
	 */
	public double myPow2(double x, int n) {
		long l = Math.abs((long) n);
		double ans = 1.0;
		while (l > 0) {
			if ((l & 1) == 1)
				ans *= x;
			x *= x;
			l >>= 1;
		}
		return n < 0 ? 1 / ans : ans;
	}
}
