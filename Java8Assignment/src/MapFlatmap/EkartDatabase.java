package MapFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

	public static List<Customer> getAll() {
		return Stream.of(new Customer(101, "john", "j@gmail.com", Arrays.asList("9876543212", "9865241342")),
				new Customer(102, "miya", "m@gmail.com", Arrays.asList("9876543211", "9865241344")),
				new Customer(103, "haider", "h@gmail.com", Arrays.asList("9876543112", "9865241322")),
				new Customer(104, "jihan", "jihan@gmail.com", Arrays.asList("9873343212", "9865241422"))

		).collect(Collectors.toList());
	}

}
