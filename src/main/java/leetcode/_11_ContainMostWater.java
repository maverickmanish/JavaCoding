package leetcode;

public class _11_ContainMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int maxArea(int[] height) {
		 int max=0;
		 for(int i=0,j=height.length-1;i<j;)
		 {
			 int minHeight = Math.min(height[i], height[j]);
			int k = minHeight  * (j-i);
			if(max< k) {
				max = k;
			}
			
			if(height[i]< height[j]) {
				i++;
			}
			else {
				j--;
			}
		 }
		 return max;
	    }

}
