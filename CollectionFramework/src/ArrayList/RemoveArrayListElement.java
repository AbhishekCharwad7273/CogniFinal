package ArrayList;

import java.util.ArrayList;

public class RemoveArrayListElement {

	public static void main(String[] args) {

		ArrayList<String> clr = new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		System.out.println("before Remove"+clr);
		clr.remove(4);
		System.out.println("After Remove"+clr);
	}

}
