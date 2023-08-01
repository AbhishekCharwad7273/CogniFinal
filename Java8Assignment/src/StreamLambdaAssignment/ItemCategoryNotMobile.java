package StreamLambdaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ItemCategoryNotMobile {

	public static void main(String[] args) {
		List<Item>item_List=new ArrayList<Item>();
		item_List.add(new Item(134, "Moto24",15000,"Mobiles"));
		item_List.add(new Item(157, "Spiderman",50,"Books"));
		item_List.add(new Item(204, "Acer",70000,"Laptops"));
		item_List.add(new Item(210, "iPhone",45000,"Mobiles"));
		item_List.add(new Item(215, "Shirt",1500,"Shirts"));

		item_List.stream().filter(e->!e.getCategory().equalsIgnoreCase("Mobiles")).forEach(System.out::println);

		Optional<Item> findThird = item_List.stream().sorted(Comparator.comparingDouble(Item::getPrice).reversed()).skip(2).findFirst();
		System.out.println(findThird.get());//highest 3rd salary
		
	
		Optional<Item> findFirst = item_List.stream().sorted(Comparator.comparingDouble(Item::getPrice)).skip(3).findFirst();
		System.out.println(findFirst.get());
		
		
	}

}
