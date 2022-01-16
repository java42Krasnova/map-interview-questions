package telran.util.words;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
	/**
	 * 
	 * @param word
	 * @param anagram
	 * @return true if anagram contains a word comprising of only all letters from a
	 *         given word (case insensitive) Implementation requirements: O[N],
	 *         using only map and two passings's over(one is over word and other is
	 *         the anagram)
	 */
	public static boolean isAnagram(String word, String anagram) {
		if(word.isEmpty() || anagram.isEmpty() || word.length() != anagram.length()) {
			return false;
		}
		Map<Character, Integer> mapLetters = getMap(word);
		for (Character letterAnnagram : anagram.toLowerCase().toCharArray()) {
			if (!mapLetters.containsKey(letterAnnagram) ||
					mapLetters.get(letterAnnagram) == 0) {
				return false;
			}
			mapLetters.put(letterAnnagram, mapLetters.get(letterAnnagram)-1);
		}
		return true;
	}

	private static Map<Character, Integer> getMap(String word) {
		Map<Character, Integer> map = new HashMap<>();
		for (Character let : word.toLowerCase().toCharArray()) {
			Integer countOfLetters = map.getOrDefault(let, 0);
			map.put(let, ++countOfLetters);
		}
		return map;
	}
}
