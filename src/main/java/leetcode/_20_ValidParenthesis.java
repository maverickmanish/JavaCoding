package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class _20_ValidParenthesis {
	Set<Character> bracket= new HashSet<>();
	public static void main(String[] args) {
		
	}
	
	public static boolean isValid2(String s) {
		char[] charArray = s.toCharArray();
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Stack<Character> stack = new Stack<Character>();
		for (Character c : charArray) {
		if (map.keySet().contains(c)) {
		stack.push(c);
		} else if (map.values().contains(c)) {
		if (!stack.isEmpty() && map.get(stack.peek()) == c) {
		stack.pop();
		} else {
		return false;
		}
		}
		}
		return stack.isEmpty();
		}
	
		/*
		 * 
		 * Time complexity: O(N). Space complexity: O(N).
		 */
	  public boolean isValid(String s) {
		  Stack<Character> stack = new Stack<Character>(); 
	         
	        for (int i = 0; i < s.length(); i++) { 
	            char ch = s.charAt(i); 
	            if (ch == '(' || ch == '{' || ch == '[') { 
	                stack.push(ch); 
	            } else { 
	                if (!stack.isEmpty() && isPairParenthesis(stack.peek(), ch)) { 
	                    stack.pop(); 
	                } else { 
	                    return false; 
	                } 
	            } 
	        } 
	        return stack.isEmpty(); 
	    } 
	 
	    private static boolean isPairParenthesis(char c1, char c2) { 
	        return (c1 == '(' && c2 == ')')  
	            || (c1 == '{' && c2 == '}') 
	            || (c1 == '[' && c2 == ']'); 
	    }     
	}