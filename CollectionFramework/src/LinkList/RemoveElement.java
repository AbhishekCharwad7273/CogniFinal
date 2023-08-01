package LinkList;

import java.util.LinkedList;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");

		
		System.out.println("LinkedList Are"+ll);

		ll.remove(2);
		
		System.out.println("After Remove"+ll);
	}

}
