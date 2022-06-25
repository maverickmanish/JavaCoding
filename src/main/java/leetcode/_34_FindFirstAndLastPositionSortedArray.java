package leetcode;

public class _34_FindFirstAndLastPositionSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public static int[] searchRange(int[] A, int target) {
		
		  int[] is = new int[] {-1,-1};
			
		  if(A.length == 0 )  return is;
			
		  is[0]=findLeft(A, target);
		  is[1]=findRight(A, target);
		return  is;
	        
	    }

	private static int findLeft(int[] A, int target) {
		int L = 0, R = A.length - 1;
		while (L+1 < R) {
			int M = (L + R) / 2;
			if (A[M] < target) {
				L = M;
			} else {
				R = M;
			}
		}
		  if(A[L]==target) return L;
		  if(A[R]==target) return R;
				  return -1;
	}
	
	private static int findRight(int[] A, int target) {
		int L = 0, R = A.length - 1;
		while (L+1 < R) {
			int M = (L + R) / 2;
			if (A[M] <= target) {
				L = M;
			} else {
				R = M;
			}
		}
		  if(A[R]==target) return R;
		  if(A[L]==target) return L;
		
				  return -1;
	}
}
