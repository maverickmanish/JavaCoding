package leetcode;

public class _42_TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}

	/*
	 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
	 */
	public static int trap(int[] height) {
		int total=0,maxLeft = height[0], maxIndex = 0, max = height[0], i = 0, len = height.length;

		while (++i < len) {
			if (max < height[i]) {
				maxIndex = i;
				max = height[i];
			}
		}
		int middle = height[maxIndex];
		for(i=1;i<maxIndex;i++)
			{
			int min = Math.min(maxLeft, middle);
			total+=  min>height[i] ? min-height[i]:0;
			maxLeft=Math.max(maxLeft, height[i]);
			}
		maxLeft=height[len-1];
		for(i=len-2;i>maxIndex;i--)
		{
		int min = Math.min(maxLeft, middle);
		total+=  min>height[i] ? min-height[i]:0;
		maxLeft=Math.max(maxLeft, height[i]);
		}
		return total;
	}

}
