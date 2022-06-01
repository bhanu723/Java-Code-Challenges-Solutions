package interviewcodechallenges;

public class EvenOddBitwise {

	public static void main(String[] args) {

		int n=12;
		System.err.println(isEven(n));
		
	}

	private static boolean isEven(int n) {
		return ((n&1)==1)?false:true;
		/*
		 * 1 0 1 1->Least Significant Number(LSB), this determines if the no is odd or even, if this no returns 1 then its odd else even
		 * 0 0 0 1 (& operation)
		 * =======
		 * 0 0 0 1
		 * =======
		 */
	
	}

}
