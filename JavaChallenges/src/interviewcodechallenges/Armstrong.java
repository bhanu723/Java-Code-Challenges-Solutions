
/*
 * @Author : BhanuSurendra Deepala
 * 
 * Challenge: Find whether given number is Armstrong or not
 * Test 371. Three digits. 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371. Armstrong number.
 * Test 1634. Four digits. 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634. Armstrong number.
 * Test 54748. 5^5 + 4^5 + 7^5 + 4^5 + 8^5 = 3125 + 1024 + 16807 + 1024 + 32768 = 54748
 * 
 */
package interviewcodechallenges;

public class Armstrong {

	public static void main(String[] args) {
		
		//true scenarios
		System.out.println(isArmstrong(153));
		System.out.println(isArmstrong(1634));
		System.out.println(isArmstrong2(54748));
		System.out.println(isArmstrong2(0));
		
		//false scenarios
		System.out.println(isArmstrong2(100)); 
		System.out.println(isArmstrong(150));
	}

	
	/*
	 * Approach1 : Convert given number to String, extract each char then convert to Integer and take cube and sum
	 */
	private static boolean isArmstrong2(int number) {
		
		boolean flag=false;
		String strNumber = Integer.toString(number);
		
		int n = strNumber.length();
		long sum=0;
		for(int i=0;i<n;i++) {
			int baseNo =Character.getNumericValue(strNumber.charAt(i)); 
			sum+=Math.pow(baseNo, n);
		}
		if(number==sum)
			flag=true;
	
		return flag;
	}
	

	/*
	 * Approach1 : Extract each number and take nth power and sum
	 */
	
	private static boolean isArmstrong(int number) {
		int inputNo=number;
		boolean flag=false;
		int sum=0;
		int l = Integer.toString(number).length(); // convert to given number to String to get length
		
		while(inputNo>0) {
			int y = inputNo%10;
			sum+=Math.pow(y, l);
			inputNo=inputNo/10;
		}
		if(sum==number)
			flag=true;
		
		return flag;
		
	}

}
