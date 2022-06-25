package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _48_RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public void rotate(int[][] matrix) {
	        int length = matrix.length;
			for (int i = 0; i < length; i++) {
				/*
				 * Transpose
				 */
	        	for (int j = 0; j < length; j++) {
					if(i!=j)
					{
						int temp=matrix[i][j];
						matrix[i][j]=matrix[j][i];
						matrix[j][i]=temp;
					}
				}
			}
	        
	        /* Reverse column */
	        for (int i = 0; i < length; i++) {
	        	for (int j = 0; j < length; j++) {
						int temp=matrix[i][j];
						matrix[i][j]=matrix[i][length-j-1];
						matrix[i][length-j-1]=temp;
				}
			}
	    }
}
