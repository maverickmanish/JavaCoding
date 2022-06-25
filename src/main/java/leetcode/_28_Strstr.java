package leetcode;

public class _28_Strstr {

	public static void main(String[] args) {
	}
	
	 public int strStr(String haystack, String needle) {
	    return  (needle.isEmpty()) ? 0: haystack.indexOf(needle);
	    }

}
