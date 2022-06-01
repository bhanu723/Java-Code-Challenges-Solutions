package interviewcodechallenges;

public class FlipIthdigit {

	public static void main(String[] args) {

	int n = 10;
	int i = 2;
	System.out.println(Integer.toBinaryString(10));
	System.out.println(flipIthdigit(n,i));
	System.out.println(Integer.toBinaryString(flipIthdigit(n, i)));
		
	}

	private static int flipIthdigit(int n, int i) {
		
		// 1 0 1 0 = 10 we need to flip 2nd digit
		// Approach 1 : Create a mask i'th position as 1 and shift left to ith times and do XOR
		// Mask = 1<<i = 10 if i =2 then do ^ => n^(1<<i)
		return n^(1<<i-1);
	}

}
