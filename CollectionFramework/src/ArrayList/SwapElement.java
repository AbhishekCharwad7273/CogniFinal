package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {

	public static void main(String[] args) {
		
		
		
		
		

		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		System.out.println("Before swap"+clr);
		
		Collections.swap(clr, 0, 3);

		System.out.println("after swap"+clr);
		

	}

}
