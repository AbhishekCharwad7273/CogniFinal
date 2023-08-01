
public class Course {

	int course_ID;
	String course_Name;
	String course_Teacher;
	String course_Duration;

	public int getCourse_ID() {
		return course_ID;
	}

	@Override
	public String toString() {
		return "Course [course_ID=" + course_ID + ", course_Name=" + course_Name + ", course_Teacher=" + course_Teacher
				+ ", course_Duration=" + course_Duration + ", total_Fees=" + total_Fees + "]";
	}

	public void setCourse_ID(int course_ID) {
		this.course_ID = course_ID;
	}

	public String getCourse_Name() {
		return course_Name;
	}

	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}

	public String getCourse_Teacher() {
		return course_Teacher;
	}

	public void setCourse_Teacher(String course_Teacher) {
		this.course_Teacher = course_Teacher;
	}

	public String getCourse_Duration() {
		return course_Duration;
	}

	public void setCourse_Duration(String course_Duration) {
		this.course_Duration = course_Duration;
	}

	public int getTotal_Fees() {
		return total_Fees;
	}

	public void setTotal_Fees(int total_Fees) {
		this.total_Fees = total_Fees;
	}

	public Course(int course_ID, String course_Name, String course_Teacher, String course_Duration, int total_Fees) {
		super();
		this.course_ID = course_ID;
		this.course_Name = course_Name;
		this.course_Teacher = course_Teacher;
		this.course_Duration = course_Duration;
		this.total_Fees = total_Fees;
	}

	int total_Fees;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
