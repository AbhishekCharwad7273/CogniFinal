import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;	
import java.util.stream.Collectors;

public class StartWithEndWithSameCharcter {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("ab","aba","xyx","mno","xyz","pop");

	l.stream().filter(x->x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0)))).forEach(System.out::println);

	//print string greater than 2
		//l.stream().filter(i->i.length()>2).forEach(System.out::println);
	//	System.out.println(l.stream().filter(i->i.length()>2).count());
	

		//print random number
		Random r=new Random();
		//r.ints(1,100).distinct().limit(10).sorted().forEach(System.out::println);
		
		//calculate sum of digit
		List<Integer>sumOfDigits=Arrays.asList(1,2,3,4,5);
		
		System.out.println(sumOfDigits.stream().reduce(0,Integer::sum));
		

}
}