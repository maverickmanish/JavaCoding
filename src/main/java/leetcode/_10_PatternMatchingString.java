package leetcode;

/*In the pattern matching, we've use memoization to optimize the time complexity

currently, it's O ( s's length * p's length)
*/



public class _10_PatternMatchingString {
    
/*	static Boolean[][] memoization;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isMatch("aa", "*"));

	}

	public static boolean isMatch(String s, String p) {
		 if("*".equals(p) || ".*".equals(p)) return true;
		 memoization=new Boolean[s.length()+1][p.length()+1]; 
		return match(0,0,s,p);
	}

	private static boolean match(int i, int j, String s, String p) {
		if(j==p.length()) return i==s.length();
		if(memoization[i][j]!=null) return memoization[i][j];
		boolean firstMatch= i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?');
		boolean ans=false;
		
		if(j+1 <p.length() && p.charAt(j+1)=='*')
		{
			ans = (firstMatch && match(i+1, j, s, p)) || match(i, j+2, s, p);
		}
		else
		{
			ans = firstMatch && match(i+1, j+1, s, p);
		}
		memoization[i][j]=ans;
		return ans;
	}*/

	Boolean[][] memoization;
	public  boolean isMatch(String s, String p) {
		memoization=new Boolean[s.length()+1][p.length()+1];
		return match(0,0,s,p);
	}

	private  boolean match(int i, int j, String s, String p) {
		if(j==p.length()) return i==s.length();
		if(memoization[i][j]!=null) return memoization[i][j];
		boolean firstMatch= i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');
		boolean ans=false;

		if(j+1 <p.length() && p.charAt(j+1)=='*')
		{
			ans = (firstMatch && match(i+1, j, s, p)) || match(i, j+2, s, p);
		}
		else
		{
			ans = firstMatch && match(i+1, j+1, s, p);
		}
		memoization[i][j]=ans;
		return ans;
	}

}
