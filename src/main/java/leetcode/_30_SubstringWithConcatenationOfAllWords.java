package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _30_SubstringWithConcatenationOfAllWords {

	public static void main(String[] args) {
		System.out.println(findSubstring("barfoothefoobarman", new String[] { "foo", "bar" }));

	}

	public static List<Integer> findSubstring(String s, String[] words) {
		if (s == null || s.isEmpty() || words.length == 0 || words == null)
			return new ArrayList<>();

		Map<String, Integer> frequencyWord = new HashMap<>();

		int i = 0, eachWordLength = words[i].length(), wordCount = words.length;
		for (; i < wordCount; i++)
			frequencyWord.put(words[i], frequencyWord.getOrDefault(words[i], 0) + 1);

		List<Integer> indexList = new ArrayList<>();
		for (i = 0; i <= s.length() - (eachWordLength * wordCount); i++) {
			Map<String, Integer> seenWord = new HashMap<>();
			for (int j = 0; j < wordCount; j++) {
				int wordIndex = i + j * eachWordLength;

				String subString = s.substring(wordIndex, wordIndex + eachWordLength);

				if (!frequencyWord.containsKey(subString))
					break;
				
				seenWord.put(subString, seenWord.getOrDefault(subString, 0) + 1);
				
				if(seenWord.get(subString) > frequencyWord.get(subString))
					break;
				
				if(j+1==wordCount)
					indexList.add(i);
				
			}
		}
		return indexList;

	}
}
