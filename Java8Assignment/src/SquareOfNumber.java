import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer>nos=Arrays.asList(4,5,20,7,10,9);
		List<Integer> square = nos.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(square);
		
		List<Integer> greater = square.stream().filter(i->i>=100).collect(Collectors.toList());
		System.out.println(greater);

		Double Avg = greater.stream().collect(Collectors.averagingDouble(Integer::intValue));
		System.out.println(Avg);
	}

}
