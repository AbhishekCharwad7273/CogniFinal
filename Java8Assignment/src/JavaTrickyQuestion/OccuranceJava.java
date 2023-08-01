package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

public class OccuranceJava {

	public static void main(String[] args) {
		
		
		String str="askjsndsfbsdfb";
		Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
	}

}
