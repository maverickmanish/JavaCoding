package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _36_ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean isValidSudoku(char[][] board) {
	        Set<String> set= new HashSet<>();
	        for(int i=0; i<board.length;i++)
	        {
	        	for(int j=0;j<board[i].length;j++)
	        	{
	        		if(board[i][j]!='.' && ( !set.add("Row"+i+board[i][j]) || !set.add("Col"+j+board[i][j]) || !set.add("Box"+((i/3)*3+j/3) +board[i][j]) ))
	        			return false;
	        			
	        	}
	        }
	        return true;
	    }
}
