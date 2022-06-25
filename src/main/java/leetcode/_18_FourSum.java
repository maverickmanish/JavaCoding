package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_FourSum {
	List<List<Integer>> result=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public List<List<Integer>> fourSum(int[] nums, int target) {
	int length=nums.length;
	if(length<4)
		return result;
	Arrays.sort(nums);

	for (int i = 0; i < length - 3; i++) {  // O(n)
		if (i == 0 || nums[i] > nums[i - 1]) {
			threeSumHelper(nums, i,target); // O(n)
		}
	}
	return result;
}

private void threeSumHelper(int[] nums, int i,int target) { 
	for (int j = i+1; j < nums.length - 2; j++) {  // O(n)
		if (j == i+1 || nums[j] > nums[j - 1]) {
			int start = j + 1;
			 int end = nums.length - 1;
			twoSumHelper(nums, start, end,nums[i], target); // O(n)
		}
	}
}

private void twoSumHelper(int[] nums, int start, int end, int first, int target) { 
	int second = nums[start-1];
	while (start < end) {
		// case 1
		 int sum = first + second + nums[start] + nums[end];
		if (sum == target) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(first);
			temp.add(second);
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
		} else if (sum < target) {
			start++;
			// case 3
		} else {
			end--;
		}
	}
}
}
