package leetcode;

import java.util.Arrays;

public class _16_ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public int threeSumClosest(int[] nums, int target) {
		int length = nums.length;
		int closesetSum = nums[0] + nums[1] + nums[length - 1];
		if(length==3)
			return closesetSum;
		 Arrays.sort(nums); // O(nlogn)
		    for (int i = 0; i < length - 2; i++) {
		      int start = i + 1;
		      int end = length - 1;
		      while (start < end) {
		    	  if(closesetSum==target)
		    		  return closesetSum;
		        int currSum = nums[i] + nums[start] + nums[end];
		        if (currSum > target) {
		          end--;
		        } else {
		          start++;
		        }

		        if (Math.abs(currSum - target) < Math.abs(closesetSum - target)) {
		          closesetSum = currSum;
		        }
		      }
		    }
		    return closesetSum;
	}
}
