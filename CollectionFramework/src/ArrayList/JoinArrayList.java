package ArrayList;

import java.util.ArrayList;

public class JoinArrayList {

	public static void main(String[] args) {
		

		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		System.out.println("1st Arraylist"+clr);
		

		ArrayList<String>clr2=new ArrayList<>();
		clr2.add("dove");
		clr2.add("orange");
		clr2.add("purple");
		clr2.add("yellow");
		clr2.add("golden");
		
		System.out.println("2nd ArrayList"+clr2);
		
		ArrayList<String>join=new ArrayList<>();
		join.addAll(clr);
		join.addAll(clr2);
		
		System.out.println("join arrylist are"+join);
	}

}
