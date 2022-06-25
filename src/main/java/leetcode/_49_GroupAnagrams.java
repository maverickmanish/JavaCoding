package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		int length = strs.length;
		if (length == 0 || strs == null)
			return new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			String key = findKey(strs[i]);
			if (map.containsKey(key)) {
				map.get(key).add(strs[i]);
			} else {
				List<String> list = new ArrayList<>();
				list.add(strs[i]);
				map.put(key, list);
			}
		}
		return new ArrayList<>(map.values());
	}

	private String findKey(String string) {
		int[] letters = new int[26];
		for (char i : string.toCharArray()) {
			letters[i - 'a']++;
		}
		StringBuilder st = new StringBuilder();
		for (int k = 0; k < letters.length; k++) {
			st.append(letters[k]).append("#");
		}
		return st.toString();
	}

	private String findKeyArraySort(String string) {
		char[] charArray = string.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);

	}
}
