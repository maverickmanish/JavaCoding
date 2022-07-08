package leetcode;

public class _154_findMinInSortedArrayWithDuplicates {

	public static void main(String[] args) {

	}

	public static int findMin(int[] nums) {
		int length = nums.length, i = nums[0];
		if (length == 1 || i < nums[length - 1])
			return i;
		int L = 0, R = length - 1;
		while (L < R) {
			int M = (L + R) / 2;
			if (nums[M] > nums[R])
				L = M + 1;
			else if (nums[M] == nums[R])
				R--;
			else
				R = M;
		}
		return nums[L];
	}
}
