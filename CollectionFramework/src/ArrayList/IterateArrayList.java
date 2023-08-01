package ArrayList;

import java.util.ArrayList;

public class IterateArrayList {

	public static void main(String[] args) {

		ArrayList<String> clr = new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");

		System.out.println("before Iterate" + clr);

		for (String s : clr) {
			System.out.println(s);
		}

		clr.stream().forEach(System.out::println);

	}

}