package LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");

		ll.stream().forEach(System.out::println);
		
		System.out.println("LinkedList Are"+ll);
		
		ArrayList< String>al=new ArrayList<String>(ll);
		
		for(String e:al)
		{
			System.out.println(e);
		}

		
	}

}
