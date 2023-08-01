package LinkList;

import java.util.LinkedList;

public class CompareLL {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		ll.add("dog");
		ll.add("Cat");
		ll.add("lion");
		ll.add("Tiger");

		LinkedList<String> ll2 = new LinkedList<>();
		ll2.add("dog");
		ll2.add("Rat");
		ll2.add("Girraf");
		ll2.add("Tiger");

		LinkedList<String> cmp = new LinkedList<>();

		for (String e : ll) {
			cmp.add(ll2.contains(e) ? "yes" : "No");
			System.out.println(cmp);
		}

	}

}
