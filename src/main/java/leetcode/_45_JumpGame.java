package leetcode;

public class _45_JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int jump(int[] nums) {
		int pos = 0, des = 0, jump = 0, j = nums.length - 1;
		for (int i = 0; i < j; i++) {
			des = Math.max(des, nums[i] + i);
			if (pos == i) {
				pos = des;
				jump++;
			}
			if (pos == j)
				break;
		}
		return jump;
	}
}
