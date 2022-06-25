package leetcode;

public class _26_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int removeDuplicates(int[] nums) {
		int length = nums.length,i = 0, j = i + 1;;
		for (; i < length && j < length;) {
			if (nums[i] != nums[j]) {
				nums[i + 1] = nums[j];
				i++;
			}
			j++;
		}
		
			
		return ++i;
	}
}
