package leetcode;

public class _371_SumOfTwoIntegersWithoutPlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getSum(int a, int b) {
		int xor = a ^ b;
		int carry = a & b;
		return carry == 0 ? xor : getSum(xor, carry << 1);
	}
}
