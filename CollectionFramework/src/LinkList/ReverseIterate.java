package LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseIterate {

	public static void main(String[] args) {
	
		
		LinkedList<String>ll=new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");
		
	     Iterator it=ll.descendingIterator();
		
	     while(it.hasNext())
	     {
	    	 System.out.println(it.next());
	     }

	}

}
