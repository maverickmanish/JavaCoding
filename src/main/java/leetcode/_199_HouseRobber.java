package leetcode;

import java.util.Arrays;

public class _199_HouseRobber {

	public static void main(String[] args) {
	}

	int dp[];

	public int robIterative(int[] nums) {
		int two = 0, one = 0, max_amount = 0;
		for (int num : nums) {
			max_amount = Math.max(two + num, one);
			two = one;
			one = max_amount;
		}
		return max_amount;
	}

	public int rob2(int[] nums) {
		int length = nums.length;
		if (length == 1)
			return nums[0];
		dp = new int[length];
		Arrays.fill(dp, -1);
		return rob(nums, length - 1);
	}

	private int rob(int[] nums, int i) {
		if (i < 0)
			return 0;
		if (dp[i] != -1)
			return dp[i];
		return dp[i] = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
	}

	public int rob(int[] nums) {
		int length = nums.length;
		if (length == 1)
			return nums[0];
		int dp[] = new int[length];
		Arrays.fill(dp, -1);
		return Math.max(robber(0, nums, dp), robber(1, nums, dp));
	}

	private int robber(int i, int[] nums, int[] dp) {
		if (i >= nums.length)
			return 0;
		if (dp[i] != -1)
			return dp[i];
		int x = 0;
		if (i >= nums.length - 2)
			x = nums[i];
		else
			x = nums[i] + Math.max(robber(i + 2, nums, dp), robber(i + 3, nums, dp));
		dp[i] = x;
		return x;
	}
}
