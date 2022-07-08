package leetcode;

public class _153_findMinInSortedArray {

	public static void main(String[] args) {

	}

	  public static int findMin(int[] nums) {
	        int length = nums.length,i = nums[0];
			if(length==1 || i<nums[length-1]) return i;
			int L=0, R=length-1;
			while(L<R)
			{
				int M= (L+R)/2;
				if(nums[M]>nums[R])
					L=M+1;
				else
					R=M;
			}
			return nums[L];
	    }
}
