package leetcode;

import java.util.Arrays;

public class _238_productExceptSelf {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(productExceptSelf(new int[] { 1, 2, 3, 4 })));

	}

	/*
	 * Approach 1 TC - O(N) SC - O(N)
	 */
	public static int[] productExceptSelf(int[] nums) {
		int length = nums.length, i = 1, j = length - 2;
		if (length == 2)
			return new int[] { nums[1], nums[0] };
		int[] left = new int[length], right = new int[length], op = new int[length];
		left[0] = nums[0];
		right[length - 1] = nums[length - 1];
		for (; i < length; i++, j--) {
			left[i] = left[i - 1] * nums[i];
			right[j] = right[j + 1] * nums[j];
		}
		op[0] = right[1];
		op[length - 1] = left[length - 2];
		for (i = 1; i < length - 1; i++) {
			op[i] = left[i - 1] * right[i + 1];
		}
		return op;
	}

	/*
	 * Approach 2 TC - O(N) SC - O(1)
	 */
	public static int[] productExceptSelf2(int[] nums) {
		int length = nums.length, i = 1;
		int[] op = new int[length];
		op[0] = nums[0];
		for (; i < length; i++) {
			op[i] = op[i - 1] * nums[i];
		}
		int rightProduct = 1;
		for (i = length - 1; i > 0; i--) {
			op[i] = op[i - 1] * rightProduct;
			rightProduct *= nums[i];
		}
		op[0] = rightProduct;
		return op;
	}
}