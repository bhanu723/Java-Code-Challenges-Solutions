package leetcode;

import java.util.Stack;

/*
 * @Author:BhanuSurendra Deepala
 */
public class ValidParanthesis {

	public static void main(String[] args) {
		String s = "{()[]{}}";

		System.out.println(isValidParanthesis(s));
	}

	//Approach: Add opposite symbols by going through each char from a string and push to Stack if ending braces are showed up then started popping out
	private static boolean isValidParanthesis(String s) {

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

}
