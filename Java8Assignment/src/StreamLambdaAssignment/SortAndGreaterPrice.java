package StreamLambdaAssignment;

import java.util.ArrayList;
import java.util.List;

public class SortAndGreaterPrice {

	public static void main(String[] args) {
		List<Item>item_List=new ArrayList<Item>();
		item_List.add(new Item(134, "Moto24",15000,"Mobiles"));
		item_List.add(new Item(157, "Spiderman",50,"Books"));
		item_List.add(new Item(204, "Acer",70000,"Laptops"));
		item_List.add(new Item(210, "iPhone",45000,"Mobiles"));
		item_List.add(new Item(215, "Shirt",1500,"Shirts"));

		item_List.stream().filter(e->e.getCategory().equalsIgnoreCase("Mobiles"))
		.filter(p->p.getPrice()>20000).forEach(System.out::println);
	}

}
