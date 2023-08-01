package RelationLambda;

import java.util.ArrayList;
import java.util.List;

import StreamLambdaAssignment.Item;

public class StreamDate {

	public static void main(String[] args) {

		List<Item> item_List = new ArrayList<Item>();
		
		item_List.add(new Item(134, "Moto24", 15000, "Mobiles"));
		item_List.add(new Item(157, "Spiderman", 50, "Books"));
		item_List.add(new Item(204, "Acer", 70000, "Laptops"));
		item_List.add(new Item(210, "iPhone", 45000, "Mobiles"));
		item_List.add(new Item(215, "Shirt", 1500, "Shirts"));

		List<Customer> customer_List = new ArrayList<Customer>();

		customer_List.add(new Customer(1, "Tom", "male", " Bangalore"));
		customer_List.add(new Customer(2, "Mike", "male", "Delhi"));
		customer_List.add(new Customer(3, "Miley", "female", "Pune"));
		customer_List.add(new Customer(4, "Kunal", "male", "Delhi"));
		customer_List.add(new Customer(5, "Sakshi", "female", "Delhi"));
		
		
		List<Orders> order_List = new ArrayList<Orders>();
		

	}

}
