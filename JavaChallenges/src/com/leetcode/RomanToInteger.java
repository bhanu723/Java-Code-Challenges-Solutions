package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		String s= "CLXIV";
		System.out.println(romanToInt(s));
	}

	// @Author : BhanuSurendra Deepala
	public static int romanToInt(String s) {

		int result = 0;
		Map<Character, Integer> romanMap = new HashMap<>();

		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		if (s != null && !s.isEmpty() && !s.isBlank()) {
			char[] charArr = s.toUpperCase().toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				if (i + 1 < charArr.length) {
					if (romanMap.get(charArr[i]) >= romanMap.get(charArr[i + 1]))
						result += romanMap.get(charArr[i]);
					else
						result -= romanMap.get(charArr[i]);

				} else
					result += romanMap.get(charArr[i]);

			}
		}

		return result;

	}

}
