package StreamLambdaAssignment;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccarancesCharcter {

	public static void main(String[] args) {
		
		
		String str="aabhisshhekk";
		
		Map<String, Long> countElement = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countElement);
	}

}
