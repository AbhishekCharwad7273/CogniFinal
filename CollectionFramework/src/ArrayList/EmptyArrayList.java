package ArrayList;

import java.util.ArrayList;

public class EmptyArrayList {

	public static void main(String[] args) {
		

		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
	//	ArrayList<String>emp=new ArrayList<>();
		
		if(clr.isEmpty())
		{
			System.out.println("Arraylist is empty");
		}
		else
		{
			System.out.println("ArrayList is non empty");
		}
		

		
		
		
		
	}

}
