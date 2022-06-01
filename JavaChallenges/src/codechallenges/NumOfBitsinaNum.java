package codechallenges;

/*
 * @Author: BhanuSurendra Deepala
 */
public class NumOfBitsinaNum {

	public static void main(String[] args) {

		int n =10;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(findNumofBits(n));
	}

	private static int findNumofBits(int n) {

		//Approach 1 : keep a counter and increment after shifting right at every iteration until n>0
		//Approach 2 : Using a formula : int(log n with base b) +1
		if(n==0)
			return 0;
		return (int)(Math.log(n)/Math.log(2))+1;
	}

}
