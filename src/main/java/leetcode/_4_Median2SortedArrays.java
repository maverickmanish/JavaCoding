package leetcode;

/*
 * This problem can be converted to the problem of finding kth element, k is (A�s length
+ B� Length)/2.
If any of the two arrays is empty, then the kth element is the non-empty array�s kth
element. If k == 0, the kth element is the first element of A or B.
For normal cases(all other cases), we need to move the pointer at the pace of half of
an array length.
*/

public class _4_Median2SortedArrays {

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1,2,16,28 },new int[] {3,12,19,44 } ));

	}

	public static double findMedianSortedArrays(int[] input1, int[] input2) {
		if (input1.length > input2.length) {
            return findMedianSortedArrays(input2, input1);
        }
        int x = input1.length;
        int y = input2.length;

        int low = 0; // here it refers to number of elements in partition possible ranging from 0 till it's length
        int high = x;
        while (low <= high) {
            int partitionX = (low + high)/2;
            int partitionY = (x + y + 1)/2 - partitionX;

            //if partitionX is 0 it means nothing is there on left side. Use -INF for maxLeftX
            //if partitionX is length of input then there is nothing on right side. Use +INF for minRightX
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                //We have partitioned array at correct place
                // Now get max of left elements and min of right elements to get the median in case of even length combined array size
                // or get max of left for odd length combined array size.
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                } else {
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) { //we are too far on right side for partitionX. Go on left side.
                high = partitionX - 1;
            } else { //we are too far on left side for partitionX. Go on right side.
                low = partitionX + 1;
            }
        }

        //Only we can come here is if input arrays were not sorted. Throw in that scenario.
        throw new IllegalArgumentException();
	}
}
