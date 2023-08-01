package JavaTrickyQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> budget = new HashMap<>();
		budget.put("cloths", 124);
		budget.put("grocery", 150);
		budget.put("utility", 100);
		budget.put("rent", 1150);
		System.out.println("map before Sorting" + budget);

		LinkedHashMap<String, Integer> sortByValue = budget.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
						(entry1, entry2) -> entry2, LinkedHashMap::new));

		System.out.println("After Sorting Ascending Order" + sortByValue);

		LinkedHashMap<String, Integer> sortByDecendingOrder = budget.entrySet().stream()
				.sorted(Collections.reverseOrder(Entry.comparingByValue()))
				.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
						(entry1, entry2) -> entry2, LinkedHashMap::new));

		System.out.println("after Sorting Decending Order" + sortByDecendingOrder);

		LinkedHashMap<String, Integer> sortByKey = budget.entrySet().stream().sorted(Entry.comparingByKey())
				.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
						(entry1, entry2) -> entry2, LinkedHashMap::new));

		System.out.println("Ascending sort By key " + sortByKey);

		
	}

}
