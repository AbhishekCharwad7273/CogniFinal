package LinkList;

import java.util.Collections;
import java.util.LinkedList;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");

		System.out.println("LinkedList Are" + ll);
		
		Collections.swap(ll, 1, 0);
		
		System.out.println("After Swap"+ll);
	}

}
