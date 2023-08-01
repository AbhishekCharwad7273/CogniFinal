package Optional;

public class NullPointerException {

	int id;
	public NullPointerException(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	String name;
	
	public static void main(String[] args) {
		
		
		NullPointerException obj=new NullPointerException(1,"Rahul");
		obj.getId();
		obj.getName();
		
		NullPointerException obj1=new NullPointerException(1,null);
		obj1.getId();
		String name=obj1.getName();
		name.toUpperCase();


	}

}
