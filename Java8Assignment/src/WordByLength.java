import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>l=Arrays.asList("I","Have", "a", "Sentence", "with","technical","words");
		
		Map<Integer, List<String>> lengthMap = l.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(lengthMap);
	}

}
