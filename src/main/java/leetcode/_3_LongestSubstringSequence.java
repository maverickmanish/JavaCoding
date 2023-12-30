package leetcode;

import java.util.Arrays;

public class _3_LongestSubstringSequence {

	public static void main(String[] args) {

		System.out.println(lengthOfLIS(new int[] { 1, 3, 4, 6, 2, 7, 5, 3, 2 }));
		System.out.println(lengthOfLongestSubstringBest("abbcdeaf"));
	}

	/*
	 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
	 * TC : O (2*n) SC : O(m) where m is the size of charset Optimization : storing
	 * the last index for occurring character
	 */
	 public int lengthOfLongestSubstringSlidingWindow(String s) {
		 int chars[]=new int[128], left=0,right=0,res=0;
		 while(right<s.length())
		 {
			 char r=s.charAt(right);
			 chars[r]++;
			 
			 while(chars[r]>1)
			 {
				 char l=s.charAt(left);
				 chars[l]--;
				 left++;
			 }
			 res=Math.max(res, (right++)-left+1);
		 }
		 return res;
	 }

		/* the last index for re-curing character */
	 public static int lengthOfLongestSubstringBest(String s) {
	      if(s.isEmpty())
	    		return 0;
	      if(s.isBlank() || s.length()==1)
	    		return 1;
	      Integer[] characterArray =new Integer[128];
	      int res = 0, left = 0,right = 0;
		 while (right < s.length()) {
			 char charAt = s.charAt(right);
			 Integer charIndex = characterArray[charAt];
			 if (charIndex != null && charIndex >= left && charIndex <= right) {
				 left = charIndex + 1;
			 }
				 res=Math.max(res, right-left+1);
				 characterArray[charAt] = right++;
		 }
		 return res;
	    }
	
	static int[][] dp;

	public static int lengthOfLIS(int[] nums) {
		int len = nums.length;
		dp = new int[len][len];
		return LISHelper(-1, 0, nums, dp);
	}

	private static int LISHelper(int prev, int curr, int nums[], int[][] dp) {
		if (curr == nums.length)
			return 0;
		if (prev != -1 && dp[prev][curr] != 0)
			return dp[prev][curr];
		int op1 = 0;
		if (prev == -1 || nums[prev] < nums[curr]) {
			op1 = 1 + LISHelper(curr, curr + 1, nums, dp);
		}
		int op2 = LISHelper(prev, curr + 1, nums, dp);
		int max = Math.max(op1, op2);
		if (prev != -1)
			dp[prev][curr] = max;
		return max;
	}
	

	 
	 public int lengthOfLongestSubstring(String s) {
	      if(s.isEmpty())
	    		return 0;
	      if(s.isBlank() || s.length()==1)
	    		return 1;
	        Boolean[] characterArray = new Boolean[256];
			Arrays.fill(characterArray, false);
			int maxLength = 0, startIndex = 0,i = 0,subStringLength=0;
		
			for (; i < s.length();) {
				
				if ( characterArray[(s.charAt(i))]) {
					Arrays.fill(characterArray, false);
					subStringLength=i-startIndex;
					maxLength = maxLength>subStringLength ?maxLength:subStringLength;
					startIndex = i = s.substring(0, i).lastIndexOf(s.charAt(i)) + 1;

				} 
				else 
					characterArray[(s.charAt(i++))] = true;

			}
			subStringLength=i-startIndex;
			maxLength = maxLength>subStringLength ?maxLength:subStringLength;
			return maxLength; 
	    }
	 

}
