package leetcode;

import java.util.Stack;

public class _32_LongestParentheses {

	public static void main(String[] args) {

		System.out.println(longestValidParentheses(")()())"));
	}

	public static int longestValidParentheses(String s) {
		if (s.isBlank() || s.length() <= 1)
			return 0;

		int max = 0;

		Stack<Character> charStack = new Stack<>();
		Stack<Integer> indexStack = new Stack<>();
		indexStack.add(-1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				charStack.push('(');
				indexStack.push(i);
			} else if (!charStack.isEmpty() && charStack.peek() == '(') {
				charStack.pop();
				indexStack.pop();
				max = Math.max(max, i - indexStack.peek());
			} else
				indexStack.push(i);

		}
		return max;
	}

	public static int longestValidParentheses2(String s) {
		if (s.isBlank() || s.length() <= 1)
			return 0;

		int max = 0;

		Stack<Integer> indexStack = new Stack<>();
		indexStack.add(-1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				indexStack.push(i);
			} else{
				indexStack.pop();
				if(indexStack.isEmpty())
					indexStack.push(i);
				else
					max = Math.max(max, i - indexStack.peek());
			} 

		}
		return max;
	}

}
