package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


final class Test
{
	private int id;
	private String name;
	
	public Test(int id,String name)
	{
		this.name=name;
		this.id=id;
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}


public class Demo {

	public static void main(String[] args) {

		Test test=new Test(1, "abhi");
		System.out.println(test.getId());
		System.out.println(test.getName());
		
		String str = "abbssdbfjeejksjk";
		Map<Character, Long> stringCount = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		// System.out.println(stringCount);
		
		System.out.print(str.substring(0, 5));
		System.out.println(str.substring(5+1));

		String countWords = "I am live in america";
		String[] strArray = countWords.split(" ");
		// System.out.println("length of Words "+strArray.length);

		String arr[] = countWords.split(" ");
		String revWords = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			revWords = revWords + arr[i] + " ";
		}
		System.out.println(revWords);

		List<Integer>l=Arrays.asList(12,3,5,6,7,8,2,2,65,32123,654,23,45);
		
		Map<Integer, Long> counting = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(counting);
		
		Integer thirdNo = l.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(2).findFirst().get();
		System.out.println(thirdNo);
		
		Integer highestNo = l.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).findFirst().get();
		System.out.println(highestNo);
	}	
}
