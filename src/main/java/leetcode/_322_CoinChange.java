package leetcode;

import java.util.Arrays;

public class _322_CoinChange {

	public static void main(String[] args) {
		System.out.println(coinChange(new int[] { 384, 324, 196, 481 }, 285));
	}

	public static int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;

		for (int coin : coins) {
			for (int i = coin; i <= amount; i++) {
				dp[i] = Math.min(dp[i], dp[i - coin] + 1);
			}
		}
		return dp[amount] <= amount ? dp[amount] : -1;
	}
}
