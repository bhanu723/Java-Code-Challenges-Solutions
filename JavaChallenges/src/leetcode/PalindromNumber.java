package leetcode;

/*
 * 
 * @Author: BhanuSurendra Deepala
 */
public class PalindromNumber {

	public static void main(String[] args) {

//		int n = 121;
		
		System.out.println(isPalindrome(12121));
		System.out.println(isPalindrome(-121)); 
		System.out.println(isPalindrome(999)); 
		System.out.println(isPalindrome(87)); 
		System.out.println(isPalindrome(9)); 
		
	}
	public static boolean isPalindrome(int x) {

		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;
		int reverse = 0;
		while (x > reverse) { // loop until half, no need to go through all digits
			reverse = reverse * 10 + x % 10;
			x = x / 10;
//			System.out.println("x="+x);
//			System.out.println("reverse ="+reverse);
		}
		return (x == reverse || x == reverse / 10);
	}
}
