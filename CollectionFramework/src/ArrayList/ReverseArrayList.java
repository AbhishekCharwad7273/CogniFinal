package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayList {

	public static void main(String[] args) {

		ArrayList<String> clr = new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
	

		System.out.println("before Reverse" + clr);

		System.out.println("Asending Order");
		
		List<String> acendingOrder = clr.stream().sorted().collect(Collectors.toList());
		System.out.println(acendingOrder);
		
		System.out.println("Decending Order");
		List<String> DecendingOrder = clr.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(DecendingOrder);
	}

}
