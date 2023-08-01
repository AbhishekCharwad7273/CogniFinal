package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		System.out.println("Before Shuffle"+clr);
		
		Collections.shuffle(clr);
		
		System.out.println("after Shuffle"+clr);

	}

}
