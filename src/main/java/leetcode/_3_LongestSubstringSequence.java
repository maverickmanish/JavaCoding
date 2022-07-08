package leetcode;

import java.util.Arrays;

public class _3_LongestSubstringSequence {

	public static void main(String[] args) {

		System.out.println(lengthOfLIS(new int[] { 1, 3, 4, 6, 2, 7, 5, 3, 2 }));

	}

	static int[][] dp;

	public static int lengthOfLIS(int[] nums) {
		int len = nums.length;
		dp = new int[len][len];
		return LISHelper(-1, 0, nums, dp);
	}

	private static int LISHelper(int prev, int curr, int nums[], int[][] dp) {
		if (curr == nums.length)
			return 0;
		if (prev != -1 && dp[prev][curr] != 0)
			return dp[prev][curr];
		int op1 = 0;
		if (prev == -1 || nums[prev] < nums[curr]) {
			op1 = 1 + LISHelper(curr, curr + 1, nums, dp);
		}
		int op2 = LISHelper(prev, curr + 1, nums, dp);
		int max = Math.max(op1, op2);
		if (prev != -1)
			dp[prev][curr] = max;
		return max;
	}
}
