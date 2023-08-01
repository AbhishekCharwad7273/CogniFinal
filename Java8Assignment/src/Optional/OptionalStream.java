package Optional;

import java.util.List;

public class OptionalStream {
	
	public static Customer getcustomerByEmailId(String email)
	{
		List<Customer> customers = EkartDatabase.getAll();
		
		return customers.stream().
				filter(cust->cust.getEmail().equals(email)).
				findAny().orElseThrow(()->new IllegalArgumentException("email error"));
		
		
	}

	public static void main(String[] args) {
		
		
		getcustomerByEmailId("pqr@gmail.com");
		
		

	}

}
