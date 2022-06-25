package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40_CombinationSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		generateCombination(0, candidates, target, new ArrayList<>(), result);
		return result;
	}

	private void generateCombination(int position, int[] candidates, int target, ArrayList<Integer> arrayList,
			List<List<Integer>> result) {

		if (target == 0)
			result.add(new ArrayList<Integer>(arrayList));
		if (target < 0)
			return;

		for (int i = position; i < candidates.length; i++) {
			if (i > position && candidates[i - 1] == candidates[i])
				continue;
			int e = candidates[i];
			arrayList.add(e);
			generateCombination(i+1, candidates, target - e, arrayList, result);
			arrayList.remove(arrayList.size() - 1);
		}

	}
}
