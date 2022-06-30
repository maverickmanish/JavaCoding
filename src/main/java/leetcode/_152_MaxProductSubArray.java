package leetcode;

public class _152_MaxProductSubArray {

	public static void main(String[] args) {

	}

	public int maxProduct(int[] nums) {
		int n = nums.length, result = nums[0], curr_max = nums[0], curr_min = nums[0];
		for (int i = 1; i < n; i++) {
			int curr_max_prev = curr_max;
			curr_max = Math.max(nums[i], Math.max(curr_max * nums[i], curr_min * nums[i]));
			curr_min = Math.min(nums[i], Math.min(curr_max_prev * nums[i], curr_min * nums[i]));
			result = Math.max(result, curr_max);
		}
		return result;
	}
}
