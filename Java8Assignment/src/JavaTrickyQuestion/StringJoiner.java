package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//input=" hello how are you
//output="[hello-how-are-you]



public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String>list=Arrays.asList("hello","how","are","you");
		System.out.println("Input String"+list);
		String formattedString = list.stream().collect(Collectors.joining("-", "[", "]"));
		System.out.println("Output String"+formattedString);
	}

}
