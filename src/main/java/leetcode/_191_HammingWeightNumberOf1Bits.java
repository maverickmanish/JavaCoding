package leetcode;

public class _191_HammingWeightNumberOf1Bits {

	public static void main(String[] args) {
	}

	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		return (n == 0 || n == 1) ? n : hammingWeight(n & (n - 1)) + 1;
	}
}
