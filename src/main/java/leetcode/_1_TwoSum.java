package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/two-sum/
	
	TC : O(n) [only linear iteration] as searching & insertion in hashtable will be O(1).
	SC : O(n) for hashTable (HashMap)*/

public class _1_TwoSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));

	}

	public static int[] twoSum(int[] nums, int target)
	{
		int i=0;
		Map<Integer,Integer> sumChecker=new HashMap<>();
		while(i<nums.length)
		{	int x=target-nums[i];
			if(sumChecker.containsKey(x))
			return new int[]{sumChecker.get(x),i};
			else
			sumChecker.put(nums[i], i);
			i++;
		}
		return null;
	}
}
