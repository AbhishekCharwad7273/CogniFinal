package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWordsWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String>l=Arrays.asList("hello"," ","world","!");
		
		String string = l.stream().collect(Collectors.joining());
		
		System.out.println(string);
	}

}
