package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _70_ClimbingStairs {

	public static void main(String[] args) {

	}

	/* Top down implementation with Memoisation */
	int[] memoization = new int[46];
	public int climbStairs(int n) {
		if (n < 3)
			return n;
		if (memoization[n] != 0)
			return memoization[n];
		memoization[n] = climbStairs(n - 1) + climbStairs(n - 2);
		return memoization[n];
	}
	/* Top down implementation with Memoisation Map */ // 2. Top Down DP
    class Solution2 {
        Map<Integer, Integer> map = new HashMap();

        public int climbStairs(int n) {
            if (n < 2)
                return 1;
            if (map.containsKey(n))
                return map.get(n);
            map.put(n, climbStairs(n - 1) + climbStairs(n - 2));
            return map.get(n);
        }
    }

    // 3. Bottom Up DP
    class Solution3 {
        public int climbStairs(int n) {
            if (n < 2)
                return 1;
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }

    // 4. Space Optimized Bottom Up DP
    class Solution4 {
        // TC - O(n);
        // SC - O(1);
        public int climbStairs(int n) {
            if (n < 2)
                return 1;
            int first = 1;
            int second = 1;
            int total = 0;
            for (int i = 2; i <= n; i++) {
                total = first + second;
                first = second;
                second = total;
            }

            return total;
        }
}
}
