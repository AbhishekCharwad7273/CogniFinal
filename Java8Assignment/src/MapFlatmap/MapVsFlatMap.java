package MapFlatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Customer>customer=EkartDatabase.getAll();
		
		List<String> emails= customer.stream().map(cust->cust.getEmail()).collect(Collectors.toList());
		System.out.println("customers emails are "+emails);
		
		//(cust->cust.getEmail())-->one to one mapping
		//map(c->c.getPhoneNumbers())-->one to many mapping
		
		List<List<String>> mobnos = customer.stream().map(c->c.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println("customers mob nos are "+mobnos);//here flaterring issue return list of list
		
		List<String> mobNo=customer.stream().flatMap(c->c.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println("customers mob nos using flatmap are "+mobNo);
	}

}
