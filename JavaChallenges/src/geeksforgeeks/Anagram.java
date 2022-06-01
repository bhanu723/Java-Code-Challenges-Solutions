package geeksforgeeks;

import java.util.Arrays;

/*
 * @Authro: BhanuSurendra Deepala
 */

public class Anagram {

	public static void main(String[] args) {

		System.out.println(isAnagram("geeksforgeeks","forgeeksgeeks"));
	}

	 public static boolean isAnagram(String a,String b)
	    {
	        
	        
	        char[] chrArrA = a.toCharArray();
	        char[] chrArrB = b.toCharArray();
	        
	        Arrays.sort(chrArrA);
	        Arrays.sort(chrArrB);
	        
	        
	        if(String.valueOf(chrArrA).equals(String.valueOf(chrArrB)))
	        	return true;
	        return false;
	        
	    }
}
