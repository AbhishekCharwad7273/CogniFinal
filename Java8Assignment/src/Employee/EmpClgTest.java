package Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmpClgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<EmpClg> employeeList = new ArrayList<EmpClg>();
		
		employeeList.add(new EmpClg(1,"abhi","pune", 25000.0));
		employeeList.add(new EmpClg(2,"rahul","sangali", 5000.0));
		employeeList.add(new EmpClg(3,"mitali","Mumbai", 35000.0));
		employeeList.add(new EmpClg(4,"Radhika","marathwada", 2000.0));
		employeeList.add(new EmpClg(5,"abhilash","satara", 55000.0));
		employeeList.add(new EmpClg(6,"tupe","nagpur", 55000.0));
		
		//employeeList.stream().filter(i->i.getSalary()>10000).forEach(System.out::println);
		
		List<EmpClg> sort = employeeList.stream().sorted(Comparator.comparing(EmpClg::getSalary)).collect(Collectors.toList());
		//System.out.println(sort);

		//employeeList.stream().map(i->i.getCity()).forEach(System.out::println);
		Map<EmpClg, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
	}

}
