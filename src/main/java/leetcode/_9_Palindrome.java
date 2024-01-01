package leetcode;

public class _9_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	   public static boolean isPalindrome(int x) {
	        if(x<0)
	            return false;
	        String s=String.valueOf(x);
	        int i=0, j=s.length()-1;
	        while(s.charAt(i)==s.charAt(j--) && i<s.length()/2)
	        {
	        	i++;
	        }
		   return i == s.length() / 2;
	    }
	   
	   public boolean isPalindromeInt(int x) {
		   if (x < 0) return false;
		   int div = 1;
		   while (x / div >= 10) {
		   div *= 10;
		   } 
		   while (x != 0) {
		   int l = x / div;
		   int r = x % 10;
		   if (l != r) return false;
		   x = (x % div) / 10;
		   div /= 100;
		   }
		   return true;
		  }


}
