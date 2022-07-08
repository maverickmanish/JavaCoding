package leetcode;

public class _338_countBits {

	public static void main(String[] args) {

	}

	public int[] countBits(int n) {
		int x[] = new int[n + 1], i = 0;
		while (++i <= n) {
			x[i] = x[i / 2];
			if (i % 2 != 0)
				x[i] += 1;
		}
		return x;
	}
}
