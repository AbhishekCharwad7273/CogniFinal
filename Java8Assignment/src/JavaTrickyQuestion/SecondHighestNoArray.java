package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.Comparator;


public class SecondHighestNoArray {

	public static void main(String[] args) {
		
		
		int []number= {1,43,12,4,2,42};
		Integer element = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst().get();
		
		System.out.println(element);
	}

}
