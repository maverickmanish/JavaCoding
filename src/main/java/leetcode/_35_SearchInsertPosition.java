package leetcode;

public class _35_SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int searchInsert(int[] A, int target) {
		int L = 0, R = A.length - 1;
		while (L < R) {
			int M = (L + R) / 2;
			if (A[M] < target) {
				L = M + 1;
			} else {
				R = M;
			}
		}
		return (A[L] < target) ? L + 1 : L;
	}
}
