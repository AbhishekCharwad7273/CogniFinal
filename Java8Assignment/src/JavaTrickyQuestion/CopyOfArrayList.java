package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CopyOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=Arrays.asList(12,23,43,12,54);
		System.out.println(list);
		
	
		
		String[]dogs= {"moon","sun","tuffy","mini","sun"};
		
		//Stream<String> inputStream = Arrays.asList(dogs).stream();
		//inputStream.forEach(i->System.out.println(i));
		
		Supplier<Stream<String>>inputStream=()->Stream.of(dogs);
		inputStream.get().forEach(System.out::println);
	
	
	
	
	}

}
