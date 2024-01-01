package leetcode;

/*In the pattern matching, we've use memoization to optimize the time complexity

currently, it's O ( s's length * p's length)
*/



public class _10_PatternMatchingString {
    

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMatch("aa", "a*"));

	}

	static Boolean[][] mem;
	static int[] len;
	public static boolean isMatch(String s, String p) {
		len = new int[]{s.length(), p.length()};
		mem =new Boolean[len[0]+1][len[1]+1];
		return match(0,0,s,p);
	}

	private static boolean match(int i, int j, String s, String p) {
		if(j== len[1]) return i== len[0];
		if(mem[i][j]!=null) return mem[i][j];
		boolean match= i< len[0]&& (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');
		boolean ans=false;

		if(j+1 < len[1] && p.charAt(j+1)=='*')
		{
			ans = (match && match(i+1, j, s, p)) || match(i, j+2, s, p);
		}
		else
		{
			ans = match && match(i+1, j+1, s, p);
		}
		mem[i][j]=ans;
		return ans;
	}
}
