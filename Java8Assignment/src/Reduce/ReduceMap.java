package Reduce;

import java.util.List;
import java.util.OptionalDouble;

public class ReduceMap {

	public static void main(String[] args) {

		List<Employee> emp = EmployeeDatabase.getAll();

		double mapAvg = emp.stream().filter(a -> a.getGrade().equalsIgnoreCase("A")).map(s -> s.getSalary())
				.mapToDouble(i -> i).average().getAsDouble();

		System.out.println(mapAvg);

		double mapSum = EmployeeDatabase.getAll().stream().filter(a -> a.getGrade().equalsIgnoreCase("A"))
				.map(s -> s.getSalary()).mapToDouble(i -> i).sum();

		System.out.println(mapSum);

		OptionalDouble mapSumReduce = EmployeeDatabase.getAll().stream().filter(a -> a.getGrade().equalsIgnoreCase("A"))
				.map(s -> s.getSalary()).mapToDouble(i -> i).reduce(Double::sum);

		System.out.println(mapSumReduce.getAsDouble());

		OptionalDouble ReduceAvg = EmployeeDatabase.getAll().stream().filter(a -> a.getGrade().equalsIgnoreCase("A"))
				.map(s -> s.getSalary()).mapToDouble(i -> i).reduce((a, b) -> (a + b) / 2);
		System.out.println(ReduceAvg.getAsDouble());

	}

}
