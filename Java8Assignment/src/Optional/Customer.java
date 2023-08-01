package Optional;

import java.util.List;
import java.util.Optional;

public class Customer {

	private int id;
	private String name;
	private String email;
	private List<String> phoneNumbers;

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumbers=" + phoneNumbers + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String email, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}

	public Optional<Integer> getId() {
		return Optional.ofNullable(id);
	}

	public void setId(int id) {
		this.id = id;
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}


}
