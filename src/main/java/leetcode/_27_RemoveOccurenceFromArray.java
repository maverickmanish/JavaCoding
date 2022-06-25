package leetcode;

import java.util.Arrays;

public class _27_RemoveOccurenceFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeElement(new int[] { 3, 2, 2, 3 }, 3));
	}

	public static String removeElement(int[] nums, int val) {
		int length = nums.length, i = 0, count = 0;
		for (; i < length ;) {
			if (nums[i] != val) 
					nums[count++] = nums[i];
				i++;
		}

		return Arrays.toString(nums);
	}
}
