package ArrayList;

import java.util.ArrayList;

public class CloneArraylist {

	public static void main(String[] args) {
		

		ArrayList<String>clr=new ArrayList<>();
		clr.add("white");
		clr.add("green");
		clr.add("blue");
		clr.add("black");
		clr.add("pink");
		
		//System.out.println("before Clone"+clr);
		
		
		ArrayList<String>cloneList=(ArrayList<String>)clr.clone();
		
		System.out.println("after clone"+cloneList);

	}

}
