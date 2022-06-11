package leetcode;

import java.util.Stack;

public class ReverseWordsinString {

	public static void main(String[] args) {

		System.out.println(reverseWords("a good   example"));
	}

	private static String reverseWords(String s) {
		String[] output= s.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		Stack<String> st = new Stack<String>();
		
		for (String string : output) {
			if(!string.isBlank())
				st.push(string.trim());
//			System.out.println(st);
		}
		
		int i = 0;
		while (!st.empty()) {
			result.append(st.pop()+" ");
		}

		return result.toString().trim();
	}

}
