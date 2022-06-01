package com.leetcode;

/*
 * @Author: BhanuSurendra Deepala
 */
import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num =  {0,1};
		System.out.println(missingNumber(num));
	}

	private static int missingNumber(int[] num) {

		int x= IntStream.range(0, num.length+1).reduce(0,(a,b)->a^b);
		return Arrays.stream(num).reduce(x,(a,b)->a^b);
		
		
		
	}

}
