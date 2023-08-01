package LinkList;

import java.util.LinkedList;

public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>ll=new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");
		
		System.out.println("before Append Linklist are"+ll);
		
		ll.addLast("Snake");
		
		System.out.println("After Append "+ll);
		
	
		
	}

}
