package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_ThreeSum {

	List<List<Integer>> result = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> threeSum(int[] nums) {
		int length = nums.length;
		if (length < 3)
			return result;
		Arrays.sort(nums); // O (nlog n)

		for (int i = 0; i < length - 2; i++) {  // O(n)
			if (i == 0 || nums[i] > nums[i - 1]) {
				int start = i + 1;
				int end = nums.length - 1;
				twoSumHelper(nums, start, end); // O(n)
			}
		}
		return result;
	}

	private void twoSumHelper(int[] nums, int start, int end) { 
		int negate = -nums[start-1];
		while (start < end) {
			// case 1
			
			if (nums[start] + nums[end] == negate) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(negate*-1);
				temp.add(nums[start]);
				temp.add(nums[end]);
				result.add(temp);
				start++;
				end--;
				// avoid duplicate solutions
				while (start < end && nums[end] == nums[end + 1])
					end--;
				while (start < end && nums[start] == nums[start - 1])
					start++;
				// case 2
			} else if (nums[start] + nums[end] < negate) {
				start++;
				// case 3
			} else {
				end--;
			}
		}
	}
}
