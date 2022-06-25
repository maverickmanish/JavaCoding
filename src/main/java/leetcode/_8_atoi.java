package leetcode;
/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 

*/

public class _8_atoi {

	private static final int maxDiv10 = Integer.MAX_VALUE / 10;
	public int atoi(String str) {
	 int i = 0, n = str.length();
	 while (i < n && Character.isWhitespace(str.charAt(i))) i++;
	 int sign = 1;
	 if (i < n && str.charAt(i) == '+') {
	 i++;
	 } else if (i < n && str.charAt(i) == '-') {
	 sign = -1;
	 i++;
	 }
	 int num = 0;
	 while (i < n && Character.isDigit(str.charAt(i))) {
	 int digit = Character.getNumericValue(str.charAt(i));
	 if (num > maxDiv10 || num == maxDiv10 && digit >= 8) {
	 return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	 }
	 num = num * 10 + digit;
	 i++;
	 } 
	 return sign * num;
	}

	
	public static void main(String[] args) {
		System.out.println(myAtoi("-91283472332"));
	}

	public static int myAtoi(String s) {
		if (s.isBlank() || s.isEmpty())
			return 0;
		s = s.trim();
		StringBuilder number = new StringBuilder();
		boolean negativeFlag = false, nonDigit = false, limitExceeds=false;
		int i = 0;
		if (s.charAt(0) == '-') {
			negativeFlag = true;
			i++;
		} else if (s.charAt(0) == '+')
			i++;
		for (; i < s.length() && !nonDigit; i++) {
			if (Character.isDigit(s.charAt(i)))
				{number.append(s.charAt(i));
				int rev=Integer.parseInt(number.toString());
				int digit = rev % 10;
				if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10))
					{limitExceeds=true;
					nonDigit=true;
					}
				}
			else
				nonDigit = true;
			
		}
		
		

		if (number.length()==0)
			return 0;
		else if(limitExceeds)
			return (negativeFlag ? Integer.MIN_VALUE : Integer.MAX_VALUE);
		else	
			number = (negativeFlag ? new StringBuilder("-").append(number) : number);

		return Integer.parseInt(number.toString());
	}
}
