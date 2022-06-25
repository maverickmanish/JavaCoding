package leetcode;

public class _31_NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void nextPermutation(int[] nums) {
		int length = nums.length;
		if (nums == null || length <= 1)
			return;
		int i = length - 2;
		while (i >= 0 && nums[i] >= nums[i + 1])
			i--;

		if (i >= 0) {
			int j = length - 1;
			while (j > i && nums[i] >= nums[j])
				j--;

			swap(nums, i, j);

			reverse(nums, i + 1, nums.length - 1);
		}
	}

	private void reverse(int[] nums, int i, int j) {
		while (i < j)
			swap(nums, i++, j--);
	}

	private void swap(int[] nums, int i, int j) {
		nums[i] = nums[i] + nums[j];
		nums[j] = nums[i] - nums[j];
		nums[i] = nums[i] - nums[j];
	}
}
