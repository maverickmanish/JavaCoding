package leetcode;

public class _33_SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int searchInsert(int[] nums, int target) {
		 int left = 0, right = nums.length - 1;
	        
	        while(left <= right){
	            int mid = (left + right) / 2;
	            if(nums[mid]==target)
	            	return mid;
	            if(nums[left] <= nums[mid]){
	                if(nums[left] <= target && target < nums[mid]){
	                    right = mid-1;
	                }else{
	                    left = mid+1;
	                }
	            }else{
	                if(nums[mid] < target && target <= nums[right]){
	                    left = mid+1;
	                }else{
	                    right = mid-1;
	                }
	            }
	        }
	        return -1;
	}
}
