package JavaTechie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ilovejavatechie";
		
		Map<String, Long> countOccurances = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countOccurances);
	}

}
