package com.codechallenges;

public class FindNthMagicNum {

	public static void main(String[] args) {

		int n=5;
		System.out.println(nthMagicNum(n));
	}

	private static int nthMagicNum(int n) {

	//Magic number is that each bit is raised to the power of its position to the base 5
	// eg: 1010 : 0*5 power 1 + 1*5power2 + 0*5power3+1*5power4
		//Approach is to find last digit by doing n&1 and then add to result(cumulative) and then right shift by 1 untill n>0
		int i=1,last_bit,result=0;
		while(n>0) {
			last_bit=n&1;
			result += last_bit*(int) Math.pow(5, i);
			n=n>>1;
			i++;
		}
		return result;
	}

}
