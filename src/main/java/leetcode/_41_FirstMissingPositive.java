package leetcode;

public class _41_FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int firstMissingPositive(int[] nums) {
		int length = nums.length;
		if (length == 1)
			if (nums[0] == 1)
				return 2;
			else
				return 1;
		boolean OneExists = false;
		int i;
		for (i = 0; i < length; i++) {
			if (nums[i] == 1) {
				OneExists = true;
				break;
			}
		}
		if (!OneExists)
			return 1;

		for (i = 0; i < length; i++) {
			if (nums[i] <= 0 || nums[i] > length)
				nums[i] = 1;
		}
		for (i = 0; i < length; i++) {
			int x = Math.abs(nums[i]) - 1;
			if (nums[x] > 0)
				nums[x] *= -1;
		}

		for (i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				return i + 1;
		}
		return length + 1;
	}
}
