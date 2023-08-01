package ArrayList;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AddElement {

	public static void main(String[] args) {
		
		
		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		
		System.out.println(clr);
		
		clr.stream().collect(Collectors.toMap(null, null));
		

	}

}
