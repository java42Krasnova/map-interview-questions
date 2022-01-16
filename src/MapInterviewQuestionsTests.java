import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.Map.Entry;
class MapInterviewQuestionsTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testOccurrencesCount() {
		String str = "lmn ab lmn aa; a, lmn ab. aa";
		String outPutExp = "lmn -> 3\naa -> 2\nab -> 2\na -> 1\n";
		String outputActual = getOccurrences(str);
		assertEquals(outPutExp, outputActual);
	}

	private String getOccurrences(String str) {
		String array[] = getWordsArray(str);
		Map<String,Integer> mapOccurences = getMap(array);
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(mapOccurences.entrySet());
		
		return getOutputString(list);
	}

	private String getOutputString(ArrayList<Entry<String, Integer>> list) {
		list.sort((e1, e2) -> e2.getValue() - e1.getValue());
		StringBuilder builder = new StringBuilder();
		for(Map.Entry<String, Integer> entry: list) {
			builder.append(String.format("%s -> %d\n", entry.getKey(),entry.getValue()));
		}
		return builder.toString();
	}

	private Map<String, Integer> getMap(String[] array) {
		TreeMap<String, Integer> res = new TreeMap<>();
		for(String word : array) {
			//res.g
			Integer count = res.getOrDefault(word, 0);
			res.put(word,  ++count);
		}
		return res;
	}

	private String[] getWordsArray(String str) {
		String delimiter = "[^a-zA-Z]+";
		return str.split(delimiter);
	}

}
