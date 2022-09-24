package leetcode;

public class _190_ReverseBits {

	public static void main(String[] args) {

	}

	/*
	 * Approach 2 
	 * 1. get the last bit from n by bitwise-AND with 1
	 * 2. shift LSB of result towards left by bitwise-Leftshift <<
	 * 3. Append the last bit from step 1 to result by bitwise-OR
	 * 4. delete the last bit of n by shifting LSB towards
	 *    right bitwise-RightShift >>
	 */
	public int reverseBits2(int n) {
		int r=0,i=0;
		while(++i<=32)
		{
			r<<=1;
			r|=(n&1);
			n>>=1;
		}
		return r;
	}
	
	/* Approach 1 */
	public int reverseBits(int n) {
		return Integer.reverse(n);
	}
}