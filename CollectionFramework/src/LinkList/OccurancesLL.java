package LinkList;

import java.util.LinkedList;

public class OccurancesLL {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");

		
		System.out.println("LinkedList Are"+ll);
		
		System.out.println("First Occurances is "+ll.getFirst());
		System.out.println("First Occurances is "+ll.getLast());
		
	}

}
