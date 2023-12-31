package JavaTrickyQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer>l=Arrays.asList(1,1,2,2,5,6,9,12,12,14);
		System.out.println("before Duplication "+ l);
		
		Set<Integer> removeDuplicate = l.stream().collect(Collectors.toSet());
		System.out.println("remove Duplicate Elements"+removeDuplicate);
		
		Set<Integer> lessThan = removeDuplicate.stream().filter(i->i<10).collect(Collectors.toSet());
		System.out.println(" no is less than 10 "+lessThan);
		
		Set<Integer> squareNum = lessThan.stream().map(i->i*i).collect(Collectors.toSet());
		System.out.println("square of less than 10 numbers "+squareNum);
		
		System.out.println(squareNum.stream().collect(Collectors.averagingInt(Integer::intValue)));
	}

}
