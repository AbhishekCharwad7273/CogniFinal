import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Count {

	public static void main(String[] args) {
		
		
		List<Integer>count=Arrays.asList(0,1,1,0,1,0,1,1,1,0,0);
		
		Integer sumOfArray = count.stream().reduce(0,Integer::sum);
		System.out.println("no of 1ns are "+sumOfArray);
		System.out.println("number of zero "+(count.size()-sumOfArray));
		
		
		
		
		
	}

}
