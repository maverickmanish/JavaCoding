package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _13_RomanToInteger {
	 @SuppressWarnings("serial")
	Map<Character, Integer> map = 
			 new HashMap<Character, Integer>() {{
			 put('I', 1); put('V', 5); put('X', 10);
			 put('L', 50); put('C', 100); put('D', 500);
			 put('M', 1000);
			 }};
	public static void main(String[] args) {
		

	}
			public int romanToInt(String s) {
			 int prev = 0, total = 0;
			 for (char c : s.toCharArray()) {
			 int curr = map.get(c);
			 total += (curr > prev) ? (curr - 2 * prev) : curr;
			 prev = curr;
			 }
			 return total;
			}

	
	 public static int romanToInt2(String s) {
	        int num=0;
	      int length = s.length();
		for (int i=0;i<length;) {
	    	if(s.charAt(i)=='C' && i+1<length && s.charAt(i+1)=='M') {num+=900; i+=2; continue;}
			if(s.charAt(i++)=='M') {num+=1000; continue;}
			if(s.charAt(i)=='C' && i+1<length && s.charAt(i+1)=='D') {num+=400; i+=2; continue;}
			if(s.charAt(i++)=='D') {num+=500; continue;}
			if(s.charAt(i)=='X' && i+1<length && s.charAt(i+1)=='C') {num+=90; i+=2; continue;}
			if(s.charAt(i++)=='C') {num+=100; continue;}
			if(s.charAt(i)=='X' && i+1<length && s.charAt(i+1)=='L') {num+=40; i+=2;continue; }
			if(s.charAt(i++)=='L') {num+=50; continue;}
			if(s.charAt(i)=='I' && i+1<length && s.charAt(i+1)=='X') {num+=9; i+=2;continue; }
			if(s.charAt(i++)=='X') {num+=10; continue;}
			if(s.charAt(i)=='I' && i+1<length && s.charAt(i+1)=='V') {num+=4; i+=2; continue;}
			if(s.charAt(i++)=='V') {num+=5; continue;}
			if(s.charAt(i++)=='I') {num+=1; continue;}
		}
	      return num;
	    }
}
