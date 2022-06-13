package leetcode;

public class WordLength {

	public static void main(String[] args) {

		String s = "   a  ";
		System.out.println(s.trim());
		System.out.println(findLengthofWord(s));
		
	}

	private static int findLengthofWord(String s) {
		s=s.trim();
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				return s.substring(i+1,s.length()).length();
			}
							
		}
		if(s.length()<2)
			return s.length();
		
		return 0;
	}
	
//	 return s.trim().length()-s.trim().lastIndexOf(" ")-1;

}
