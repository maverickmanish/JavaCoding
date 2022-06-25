package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(twoSum(new Integer[] { 2, 7, 11, 15 }, 9)));

	}

	public static int[] twoSum(Integer[] integers, int target) {
		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		int i = 0;
		while (i < integers.length) {
			if (map.containsKey(integers[i])) {
				arr[0] = map.get(integers[i]);
				arr[1] = i;
				return arr;
			} else {
				map.put(target - integers[i], i);
			}
			i++;
		}
		return arr;

	}

}
