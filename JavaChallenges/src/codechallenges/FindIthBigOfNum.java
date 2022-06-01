package codechallenges;

public class FindIthBigOfNum {

	// Find the i'th bit of a number
	public static void main(String[] args) {

		int n = 12;
		int i = 2;
		
		System.out.println(Integer.toBinaryString(n));
		System.out.println(findithBit(n,i));
		
	}

	private static int findithBit(int n,int i) {

	//0 1 0 1 0 1 0 
	// Approach 1 : Right shift i-1 times and then do result&1 to get last digit(which is i'th digit)
		
		return (n>>i-1)&1;
	}

}
