package Reduce;

public class Employee {
	
	private int id;
	private String name;
	private String grade;
	private Double salary;
	public Employee(int id, String name, String grade, Double i) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = i;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
}
