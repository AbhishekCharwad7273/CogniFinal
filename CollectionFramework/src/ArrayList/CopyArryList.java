package ArrayList;

import java.util.ArrayList;

public class CopyArryList {

	public static void main(String[] args) {
		
		
		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		System.out.println("1st arrylist"+clr);
		
		ArrayList<String>copy=new ArrayList<>();
		copy.addAll(clr);
		System.out.println("2nd Arraylist"+copy);
		
	}

}