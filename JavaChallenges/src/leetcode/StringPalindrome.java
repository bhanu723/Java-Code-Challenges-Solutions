package leetcode;

import java.util.Iterator;

public class StringPalindrome {

	public static void main(String[] args) {

		String s="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
		char[] ch = s.toCharArray();
		for(int head=0, tail=s.length()-1;head<tail;) {
			if(!Character.isLetterOrDigit(ch[tail])) tail--;
			else if(!Character.isLetterOrDigit(ch[head])) head++;
			else if(Character.toLowerCase(ch[head++])!=Character.toLowerCase(ch[tail--]))
					return false;
		}
		return true;
		
		
//		 
	}

}
