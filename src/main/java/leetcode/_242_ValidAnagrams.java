package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _242_ValidAnagrams {

	public static void main(String[] args) {

		System.out.println(isAnagram("anagram","nagaram"));

	}

	 public static boolean isAnagram(String s, String t) {
	        char[] charArray = s.toCharArray();
	        char[] charArray2 = t.toCharArray();
	        Arrays.sort(charArray);
	        Arrays.sort(charArray2);
	       return Arrays.equals(charArray, charArray2);
	    }
}