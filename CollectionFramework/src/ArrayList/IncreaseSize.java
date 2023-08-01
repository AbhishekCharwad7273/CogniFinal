package ArrayList;

import java.util.ArrayList;

public class IncreaseSize {

	public static void main(String[] args) {

		ArrayList<String> clr = new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		System.out.println("Before Size increase"+clr);
		
		clr.ensureCapacity(10);
		
		System.out.println("After Size Increase"+clr);

	}

}
