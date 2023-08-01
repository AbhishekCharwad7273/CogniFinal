package ArrayList;

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {

		
		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		

		clr.set(0, "grey");
		clr.set(3, "ostrich");
		System.out.println(clr);

	}

}
