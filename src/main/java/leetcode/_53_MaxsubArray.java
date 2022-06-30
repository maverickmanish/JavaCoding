package leetcode;

public class _53_MaxsubArray {

	public static void main(String[] args) {

	}

	public int maxSubArray(int[] nums) {
		int bestSum = nums[0], currentSum = bestSum, i = 0;
		while (++i < nums.length) {
			currentSum = Math.max(nums[i], nums[i] + currentSum);
			bestSum = Math.max(currentSum, bestSum);
		}
		return bestSum;
	}
}
