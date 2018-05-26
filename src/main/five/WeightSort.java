package five;

import util.MapUtil;

import java.util.HashMap;
import java.util.Map;

public class WeightSort {

	public static String orderWeight(String strng) {
		Map<String, Integer> map = new HashMap<>();
		String[] splitedString = strng.split(" ");

		Map<String, Integer> mapOccurence = new HashMap<>();

		for (String string : splitedString) {
			Integer test = transform(string);
			if (map.get(string) != null) {
				mapOccurence.put(string, mapOccurence.get(string) + 1);
			} else {
				mapOccurence.put(string, 1);
				map.put(string, test);
			}

		}

		Map<String, Integer> sortedMap = MapUtil.sortByValue(map);

		StringBuilder result = new StringBuilder();
		sortedMap.entrySet().forEach(entry -> {

			for (int i = 0; i < mapOccurence.get(entry.getKey()); i++) {

				if (!result.toString().isEmpty()) {
					result.append(" ");
				}
				result.append(entry.getKey().toString());
			}

		});
		return result.toString();
	}

	private static Integer transform(String string) {
		char[] charArray = string.toCharArray();
		Integer sum = 0;
		for (char c : charArray) {
			sum = sum + Integer.valueOf(String.valueOf(c));
		}

		return sum;
	}
}