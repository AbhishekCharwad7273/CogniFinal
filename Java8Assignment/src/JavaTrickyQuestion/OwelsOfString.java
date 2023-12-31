package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//find vowelsOfString
//find duplication of string

public class OwelsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="hello hello";
		
		long countOfVowels = str.chars().filter((i)->{
			return(i=='a' || i=='e' ||i=='i'|| i=='o'||i=='u');
				
		}).count();
		
		System.out.println("Count Of Vowels are "+countOfVowels);
	
		Map<String, Long> duplicationCount = str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
		System.out.println(duplicationCount);
	
	
	
	
	//find no of times a word/number got repeated
		
		//i/p=5,3,4,1,3,7,2,9,9,4
		//i/p="amanda","Rob","sunny","amanda","Rob"
		
		
		List<Integer>intArray=Arrays.asList(5,3,4,1,3,7,2,9,9,4);
		Map<Integer, Long> duplicateElement = intArray.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Duplicate Elements Are"+duplicateElement);
	

		List<String>stringArray=Arrays.asList("amanda","Rob","sunny","amanda","Rob");
		Map<String, Long> stringCount = stringArray.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Duplicate Strings Are"+stringCount);
	
	
	
	
	
	
	
	
	
	
	}

}
