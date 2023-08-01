import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		List<Course>course_List=new ArrayList<Course>();
		course_List.add(new Course(1214, "Java","Avinash","3 year", 25000));
		course_List.add(new Course(2342, "Cpp","Radhika","1 year", 5400));
		course_List.add(new Course(442, "Programmingin c","Rahul","2 year", 3100));
		course_List.add(new Course(5585, "Computer Security","Deepak","4 year", 45004));
		course_List.add(new Course(14, "Embedded programming","Aishwarya","2 year", 1480));
		course_List.add(new Course(441, "Mobile Programming","Ganesh","1 year", 25000));
		course_List.add(new Course(23, "Graphics","Nisha","3 year", 5000));
		course_List.add(new Course(432, "Cloud computing","Meenakshi","1 year", 2000));
		course_List.add(new Course(123, "java script","Mitesh","2 year", 5500));
		course_List.add(new Course(532, "Html","Amol","4 year", 7000));
		course_List.add(new Course(165, "Css","Ambika","2 year", 2000));
		course_List.add(new Course(353, "Testing","Arvind","2 year", 25000));
		course_List.add(new Course(125, "Spring boot","ravi","2 year", 15000));
		course_List.add(new Course(678, "My sql","Radha","1 year", 5000));
		course_List.add(new Course(165, "Hibernate","Pooja","3 year", 2000));
		
		
		//List<Course>sorted_List=course_List.stream().
			//	sorted((o1,o2)->(int)(o2.getTotal_Fees()-o1.getTotal_Fees())).collect(Collectors.toList());
		//System.out.println(sorted_List);
		
	//	List<Course>sorted_List1=course_List.stream().
		//	sorted(Comparator.comparingLong(Course::getTotal_Fees).reversed()).collect(Collectors.toList());

		
		//sorted_List1.forEach(System.out::println);
		
		Collections.sort(course_List,Comparator.comparing(Course::getTotal_Fees).reversed());
		
		//course_List.forEach(System.out::println);
		
		Course course = course_List.stream().sorted(Comparator.comparing(Course::getTotal_Fees).reversed()).skip(2).findFirst().get();
		System.out.println(course);
	}

}
