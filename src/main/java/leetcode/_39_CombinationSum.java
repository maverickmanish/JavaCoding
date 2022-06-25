package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _39_CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>>  result= new ArrayList<>();
	        generateCombination(0,candidates,target,new ArrayList<>(),result);
			return result;
	    }
	private void generateCombination(int position, int[] candidates, int target, ArrayList<Integer> arrayList, List<List<Integer>> result) {
		
		if(target==0)
			result.add(new ArrayList<Integer>(arrayList));
		if(target<0)
			return;
		
		for(int i=position;i<candidates.length;i++)
		{
			int e = candidates[i];
			arrayList.add(e);
			generateCombination(i, candidates, target-e, arrayList,result);
			arrayList.remove(arrayList.size()-1);
		}
		
	}
}
