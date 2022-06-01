package geeksforgeeks;

import java.util.HashMap;
import java.util.Map;
/*
 * @Authro: BhanuSurendra Deepala
 */
public class FirstRepeatedChar {

	public static void main(String[] args) {

		System.out.println(firstRepChar("gsmwjkm"));
		System.out.println(firstRepChar("evjxpnqgmvfjl")); //output v
	}

	public static String firstRepChar(String s){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				return Character.toString(s.charAt(i));
			}
			map.put(s.charAt(i), i);
		}

		return "-1";
	}
}

