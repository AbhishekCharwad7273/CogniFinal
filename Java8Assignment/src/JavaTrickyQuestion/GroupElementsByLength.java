package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupElementsByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			List<String> l=Arrays.asList("apple","banana","pear","grape");
			
			Map<Integer, List<String>> collect = l.stream().collect(Collectors.groupingBy(String::length));
			System.out.println(collect);
	}

}
