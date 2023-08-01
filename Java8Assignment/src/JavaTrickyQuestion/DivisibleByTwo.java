package JavaTrickyQuestion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleByTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>l=Arrays.asList(2,4,6,8,7);
	
	boolean areDivible=l.stream().allMatch(i->i%2==0);
	
	if(areDivible==true)
	{
		System.out.println("Array is Divible By 2");
	}
	else
	{
		System.out.println("Array is Not Divisible By 2");
	}
	
	boolean atleastDivisible=l.stream().anyMatch(i->i%2==0);
	
	if(atleastDivisible==true)
	{
		System.out.println("Atleast 1 no divisible by 2");
		
	}
	else
	{
		System.out.println("No Number Divisible by 2");
	}
	}

}
