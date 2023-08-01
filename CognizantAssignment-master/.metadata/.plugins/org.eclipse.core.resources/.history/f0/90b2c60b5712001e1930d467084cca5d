package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,2,3,1,3,4,5);
		
		list.stream().distinct().forEach(System.out::println);

		String str = "asdfghjkasdfg";

		List<String> duplicateElement = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Here is a Duplicate Element"+duplicateElement);

		List<String> nonDuplicateElement = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Here is a Non Duplicate Element"+nonDuplicateElement);
	}
} 