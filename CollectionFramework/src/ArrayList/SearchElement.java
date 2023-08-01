package ArrayList;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {

		ArrayList<String> clr = new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		if(clr.contains("white"))
		{
			System.out.println("element present in arraylist");
		}
		
		else
		{
			System.out.println("element not present in arraylist");
		}
	}

}
