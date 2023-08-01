package LinkList;

import java.util.LinkedList;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String>ll=new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");
		
		System.out.println("before Insert"+ll);
		ll.set(2, "Goat");
		System.out.println("After Insert"+ll);
		
	}

}
