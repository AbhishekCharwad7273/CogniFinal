package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtractArryList {

	public static void main(String[] args) {
		
		
		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		System.out.println("before Extract"+clr);
		
		
		
		System.out.println("After Extract"+clr.subList(1, 4));
		
		
		List<Integer>l=Arrays.asList(1,4,7,9,2,7,6);
		
		System.out.println(l.subList(3, 6));

	}

}