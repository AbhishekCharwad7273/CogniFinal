package Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;import java.util.stream.Collectors;

public class FilterMapReduce {

	public static void main(String[] args) {

		List<Integer> nos = Arrays.asList(12, 43, 1, 3, 3, 1,4,6,8);

		int sum = nos.stream().mapToInt(i -> i).sum();
		System.out.println("Sum of Arrays Using Sum Function "+sum);
		
		int OddSum = nos.stream().filter(i->i%2!=0).mapToInt(i->i).sum();
		System.out.println("Odd Sum of Arrays Using Sum Function "+OddSum);
		
		int evenSum = nos.stream().filter(i->i%2==0).mapToInt(i->i).sum();
		System.out.println("Even Sum of Arrays Using Sum Function "+evenSum);
		
		

		Integer reduceSum = nos.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum Of Arrays Using Reduced Function "+reduceSum);

		Optional<Integer> usingIntegerClassSumMethod = nos.stream().reduce(Integer::sum);
		System.out.println(usingIntegerClassSumMethod.get());

		Integer reduceMulti = nos.stream().reduce(1, (a, b) -> a * b);
		System.out.println(reduceMulti);

		Integer reduceGreaterNo = nos.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(reduceGreaterNo);

		Optional<Integer> reduceMaxInbuiltFunctionOf = nos.stream().reduce(Integer::max);
		System.out.println(reduceMaxInbuiltFunctionOf.get());
		
		
		
        List<String>lang=Arrays.asList("java","C","Python","angular","Spring");
		
		Optional<String> reduceHigHlenString = lang.stream().reduce((a,b)->a.length()>b.length()?a:b);
		System.out.println(reduceHigHlenString.get());

	}

}
