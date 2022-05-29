package core.java;

import java.util.Arrays;

public class LisClass {

	public static void main(String[] args) {
		System.out.println(longestSubstring("ABDEFGABEF".toLowerCase()));

	}

	public static String longestSubstring(String s) {
		
	/*	CustomValidators
		BeanProcessr and destroying 
		Oath protocols
		java 8 Problem 
		spring security
		Mockito and Junit*/
		
		
		Boolean[] characterArray = new Boolean[26];
		Arrays.fill(characterArray, false);
		
		int maxLength = 0, startIndex = 0;
		String longestString = "", substring = "";
		for (int i = 0; i < s.length(); ) {
			
			if (characterArray[(s.charAt(i) - 97)]) {
				Arrays.fill(characterArray,false );
				if(substring.length()>maxLength)
				{
					longestString=substring;
					maxLength=longestString.length();
				}	
				startIndex= i = s.substring(0, i).lastIndexOf(s.charAt(i)) + 1;
				
				System.out.println(" value of i in if "+i+ " "+characterArray[(s.charAt(i) - 97)]+ " substring : "+substring);
				
				
			} else {
				
				
				substring = s.substring( startIndex, i+1);
				characterArray[(s.charAt(i) - 97)]=true;
				i++;
				System.out.println(" value of i in else "+i);
			}

		}
		return longestString;

	}
}
