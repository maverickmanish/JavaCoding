package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _213_HouseRobber {

	public static void main(String[] args) {

	}

	public int rob(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
	}

	private int rob(int[] nums, int start, int end) {
		int prevTwo = 0, prevOne = 0, max = 0;
		for (int i = start; i < end; i++) {
			max = Math.max(prevTwo + nums[i], prevOne);
			prevTwo = prevOne;
			prevOne = max;
		}
		return max;
	}

	public int rob2(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		return Math.max(rob(nums, 0, nums.length - 2, new Integer[nums.length]),
				rob(nums, 1, nums.length - 1, new Integer[nums.length]));
	}

	private int rob(int[] nums, int st, int i, Integer[] dp) {
		if (i < st)
			return 0;
		if (dp[i] != null)
			return dp[i];
		return dp[i] = Math.max(rob(nums, st, i - 2, dp) + nums[i], rob(nums, st, i - 1, dp));
	}
}