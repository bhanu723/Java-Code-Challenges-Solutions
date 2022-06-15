package leetcode;

/*
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 */

// @BhanuSurendra Deepala

public class NeedleProblem {

	public static void main(String[] args) {

		String haystack = "hello";
		String needle = "ll";

		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {

		int m = haystack.length();
		int n = needle.length();
		if (n == 0) {
			return 0;
		} // if needle length is 0 then nothing to search
		if (n > m) {
			return -1;
		} // if the haystack is empty then return -1 per problem

		for (int i = 0; i < m - n + 1; i++) { // take the exact sized substrings and compare with needle
			if (haystack.substring(i, i + n).equals(needle)) {
				return i;
			}
		}
		return -1;
	}
}
