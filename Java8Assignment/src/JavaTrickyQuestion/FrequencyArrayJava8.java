package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyArrayJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		
		Map<Integer, Long> freq = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
		
		System.out.println(freq);
	}

}
