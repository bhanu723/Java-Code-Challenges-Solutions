package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * @Author; BhanuSurendra Deepala
 */
public class LongestNonRepeatingCharCount {

	public static void main(String[] args) {

		String s = "abcabcbb";
		System.out.println(findLongestNonRepeatingCharCount(s));
	}

	/*
	 * Thought process here is that take 2 points(j-fast pointer, i-slow point) and
	 * use Set to store all Characters of a string, if the char is not present in
	 * the set then add it, if it is present then use slow pointer to remove the
	 * element at ith position, final size of set is what the output
	 */
	private static int findLongestNonRepeatingCharCount(String s) {
		int i = 0, j = 0, max = 0;

		Set<Character> set = new HashSet<Character>();

		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				max = Math.max(max, set.size());
			} else
				set.remove(s.charAt(i++));

		}

		return max;
	}

}
