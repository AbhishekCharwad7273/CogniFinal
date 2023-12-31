package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String args[])
	{
	
	List<Employee> employeeList=new ArrayList<Employee>();
	
	employeeList.add(new Employee(111,"jiya brein", 32,"Female","HR", 2011, 25000.0));
	employeeList.add(new Employee(122,"paul Niksui", 25,"Male","Sales and Marketing", 2015, 13500.0));
	employeeList.add(new Employee(133,"Martin Theron", 29,"Male","Infrastructure", 2012, 18000.0));
	employeeList.add(new Employee(144,"Murli Gowda", 28,"Male","Product Development", 2014, 32500.0));
	employeeList.add(new Employee(155,"Nima Roy", 27,"Female","HR", 2013, 22700.0));
	employeeList.add(new Employee(166,"Iqbal Hussain", 43,"Male","Security And Transport", 2016, 10500.0));
	employeeList.add(new Employee(177,"Manu sharma", 35,"Male","Account And Finance", 2010, 27000.0));
	employeeList.add(new Employee(188,"Wang liu", 31,"Male","Product Development", 2015, 34500.0));
	employeeList.add(new Employee(199,"Amelia Zoe", 24,"Female","Sales And Marketing", 2016, 11500.0));
	employeeList.add(new Employee(211,"Jasana Kaur", 27,"Female","Infrastructure", 2014, 15700.0));
	employeeList.add(new Employee(222,"Nitin Joshi", 25,"Male","Product Development", 2016, 28200.0));
	
	Employee thirdSalary = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().get();
	//System.out.println(thirdSalary);
	
	Map<String, Long> counting = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	//System.out.println("count of gender"+counting);
	
	List<String> listOfDepartment = employeeList.stream().map(i->i.getDepartment()).distinct().collect(Collectors.toList());
	System.out.println("count of Department are "+listOfDepartment.stream().count());
	//System.out.println("List of Department are"+listOfDepartment);
	
	
	//sort by department
	//	employeeList.stream().sorted((e1,e2)->e1.getDepartment()
	//			.compareToIgnoreCase(e2.getDepartment())).forEach(s->System.out.println(s.getDepartment()));
	
		
		Collections.sort(employeeList,Comparator.comparing(Employee::getSalary));
		//employeeList.forEach(System.out::println);
		
		
	}
	
	

}
