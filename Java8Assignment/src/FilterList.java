import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(33);
		l.add(44);
		l.add(1);
		l.add(2);
		l.add(32);
		l.add(43);
		l.add(12);
		l.add(55);

		System.out.println(l);
		List<Integer>g=l.stream().filter(i -> i < 10).collect(Collectors.toList());
		System.out.println(g);
		System.out.println(l.stream().filter(j -> j % 2 == 0).collect(Collectors.toList()));

	}

}
