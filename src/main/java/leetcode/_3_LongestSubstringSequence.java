package leetcode;

import java.util.Arrays;

public class _3_LongestSubstringSequence {

	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubstring("hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));

	}
	
    public static int lengthOfLongestSubstring(String s) {
    	if(s.isEmpty())
    		return 0;
    	else if(s.isBlank())
    	 return 1;
    	else if(s.length()==1)
    		return 1;
      Boolean[] characterArray = new Boolean[256];
		Arrays.fill(characterArray, false);
		int maxLength = 0, startIndex = 0,i=0;
		String longestString = "" , substring = "";
		for (; i < s.length();) {
			
			if ( characterArray[(s.charAt(i))]) {
				Arrays.fill(characterArray, false);
				if (substring.length() > maxLength) {
					longestString = substring;
					maxLength = longestString.length();
				}
				startIndex = i = s.substring(0, i).lastIndexOf(s.charAt(i)) + 1;

				System.out.println(" value of i in if " + i + " " + characterArray[(s.charAt(i))] + " substring : "
						+ substring);

			} else {
				substring = s.substring(startIndex, i + 1);
				characterArray[(s.charAt(i))] = true;
				i++;
				System.out.println(" value of i in else " + i);
			}

		}
		if (substring.length() > maxLength) {
			longestString = substring;
			maxLength = longestString.length();
		}
		return longestString.length();  
    }

}
