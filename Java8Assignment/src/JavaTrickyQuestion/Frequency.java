package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {

		String str = "abbc";

		Map<String, Long> freq = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(freq);

		List<Integer> in = Arrays.asList(8, 6, 0, 4, 6, 4, 2, 7);

		List<Integer> collect = in.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);

		String string = in.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(string);

		
	}

}
