package Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeQuestionAnswer {

	public static void main(String args[]) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "jiya brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "paul Niksui", 25, "Male", "Sales and Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murli Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(211, "Jasana Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Employee ThirdSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().get();
		System.out.println(ThirdSalary);
		
		
		// program print max salary from Employee

		Optional<Employee> maxSalary = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
		 System.out.println("Highest Salary By Employee is = "+maxSalary);

		// program print min salary from Employee

		Employee employee = employeeList.stream().min(Comparator.comparing(Employee::getSalary)).get();
		// System.out.println(employee);

		// print employee details working in each department

		List<String> listOfDepartments = employeeList.stream().map(i -> i.getDepartment()).collect(Collectors.toList());
		//System.out.println(listOfDepartments);
		
		//count of each department
		Map<String, Long> eachDeptCount = employeeList. stream().map(i->i.getDepartment()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(eachDeptCount);

	Employee maxSalaryEmp = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).findFirst().get();
	//System.out.println(maxSalaryEmp);
	}
	
}
