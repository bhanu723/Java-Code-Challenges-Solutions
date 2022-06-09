package JavaTechnicalRound;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedWordsCount {

	public static void main(String[] args) {

		String sentence = "can you Google the google you can Google it";

		findRepeatedWords(sentence);

	}

	private static void findRepeatedWords(String sentence) {

//		String[] arr = sentence.toLowerCase().split(" "); // If we want to ignore case and count
		String[] arr = sentence.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String word : arr) {
			if (!map.containsKey(word)) {
				map.put(word, 1);
			} else
				map.put(word, map.get(word) + 1);

		}

		for (Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " => " + e.getValue());
		}

	}

}
