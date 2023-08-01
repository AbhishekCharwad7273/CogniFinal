package Optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Customer customer=new Customer(101,"Abhi", null,Arrays.asList("9812347635","9852435347"));
		
		Customer customer1=new Customer(101,"Abhi","a@gmail.com",Arrays.asList("9812347635","9852435347"));

		//three ways to used Optional class
		//1)empty,2)of,3)ofnullable
		
		Optional<Object>cust=Optional.empty();
		
		System.out.println(cust);
		

		//ofNullable->Combination of empty and Of method
		Optional<String> ofNullableCust = Optional.empty();
		System.out.println(ofNullableCust);
		
		Optional<Optional<String>> ofNotNullable = Optional.of(customer1.getEmail());
		System.out.println(ofNotNullable);
		
		
		System.out.println(ofNullableCust.orElse("d@gmail.com"));
		
		System.out.println(ofNullableCust.orElseThrow(()->new IllegalArgumentException("Email not present")));
		
		Optional<Optional<String>> emailOptional = Optional.of(customer.getEmail());
		System.out.println(emailOptional);
		
		
	}

}
