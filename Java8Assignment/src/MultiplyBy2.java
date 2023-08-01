import java.util.Arrays;
import java.util.List;

public class MultiplyBy2 {

	public static void main(String[] args) {
		
		List<Integer>l=Arrays.asList(10,2,4,5,6);
		
		//l.stream().map(i->i*2).forEach(System.out::println);
		
	//	l.stream().filter(i->i>2).forEach(System.out::println);
		
	//	l.stream().sorted().forEach(System.out::println);
		
	//	Integer Min = l.stream().min((x,y)->x-y).get();
		
	//	Integer Max = l.stream().max((a,b)->a-b).get();
		
	//	System.out.println(Min);
	//	System.out.println(Max);
		
		long count = l.stream().count();
		System.out.println(count);
	}

}
