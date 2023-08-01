package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		
		List<String> sortedList = clr.stream().sorted().collect(Collectors.toList());
		//System.out.println(sortedList);
		
		//clr.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		//System.out.println("before Sort"+clr);
		
		Collections.sort(clr);	
		//System.out.println("after sort Ascending"+clr);
		
		clr.sort(Collections.reverseOrder());
		//System.out.println("After Sort Decending"+clr);
	}

}
