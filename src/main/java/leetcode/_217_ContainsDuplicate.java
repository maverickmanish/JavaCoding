package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _217_ContainsDuplicate {

	public static void main(String[] args) {

		System.out.println(containsDuplicate(new int[] { 1, 2, 3, 1 }));

	}

	public static boolean containsDuplicate(int[] nums) {
		int length = nums.length;
		if (nums == null || length == 1)
			return false;
		Set<Integer> list = new HashSet<Integer>();
		list.add(nums[0]);
		for (int i = 1; i < length; i++) {
			if (list.contains(nums[i]))
				return true;
			list.add(nums[i]);
		}
		return false;
	}
}