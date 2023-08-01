package LinkList;

import java.util.LinkedList;

public class IndexLL {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");

		System.out.println("LinkedList Are" + ll);
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("element at index is "+i+" : "+ll.get(i));
		}

	}

}
