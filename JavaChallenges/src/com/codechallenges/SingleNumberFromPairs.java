package com.codechallenges;

import java.util.Arrays;

public class SingleNumberFromPairs {

	public static void main(String[] args) {

		int nums[]= {1,3,4,7,4,1,3};
		
		System.out.println(Arrays.stream(nums).reduce(0,(a,b)->a^b));
		//XOR of all pairs in o
		//Complexity is Linear O(n)
	}

}
