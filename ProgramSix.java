package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProgramSix {
	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();
		map.put(123, "Alice");
		map.put(234, "Lily");
		map.put(345, "Harlie");
		System.out.println("TreeMap : " + map);

		List<String> valueList = new ArrayList<>();

		valueList.addAll(map.values());

		Collections.sort(valueList);

		System.out.println("After Sorting the values : " + valueList);
	}
}
