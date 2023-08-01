package Reduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeDatabase {
	
	public static List<Employee> getAll() {
		return Stream.of(
				new Employee(101, "john", "A", 60000d),
				new Employee(102, "mac", "B", 30000d),
				new Employee(103, "mini", "A", 80000d),
				new Employee(104, "joy", "B", 20000d),
				new Employee(105, "ali", "A", 15000d)	
		).collect(Collectors.toList());
		
		
	}

}
