import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "abhi");
		map.put(2, "xyz");
		map.put(3, "aqr");
		map.put(4, "wer");

		//map.forEach((k, v) -> System.out.println(k + v));

		List<Integer> keySet = map.keySet().stream().collect(Collectors.toList());
		//System.out.println(keySet);

		List<String> values = map.values().stream().collect(Collectors.toList());
		//System.out.println(values);

		HashMap<Integer, String> sort = map.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), 
						(entry1, entry2) -> entry2, LinkedHashMap::new));
	
	System.out.println(sort);
	}

}
