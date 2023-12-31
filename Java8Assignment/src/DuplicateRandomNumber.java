import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateRandomNumber {

	public static void main(String[] args) {
		
		
		List<Integer>l=Arrays.asList(1,32,2,1,32,56,34,5);
		
		//System.out.println(l.stream().max(Integer::compare).get());//max no
		
		//System.out.println(l.stream().filter(i->i%2==0).collect(Collectors.toList()));//even
		
	//	System.out.println(l.stream().filter(i->i%2!=0).collect(Collectors.toList()));//odd

	Set<Integer>hs=new HashSet<>();
		
		l.stream().filter(j->!hs.add(j)).forEach(System.out::println);//duplicate element
		
	//	System.out.println(l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));//desendingorder
	
		//l.stream().sorted().forEach(System.out::println);//asending order
	
		//System.out.println("count of digit in giving list are "+l.stream().count());
	}

}
