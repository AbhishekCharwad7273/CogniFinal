package LinkList;

import java.util.LinkedList;

public class IterateLL {

	public static void main(String[] args) {
		
		
		LinkedList<String>ll=new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");
		
		for(String e:ll)
		{
			System.out.println(e);
		}

	}

}
