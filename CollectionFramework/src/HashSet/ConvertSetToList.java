package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertSetToList {

	public static void main(String[] args) {

		Set<String>hs=new HashSet<>();
		hs.add("Accenture");
		hs.add("infy");
		hs.add("TCS");
		hs.add("UBS");
		
		System.out.println(hs);
		
		ArrayList<String>al=new ArrayList<>(hs);
		 
		for(String el:al)
		{
			System.out.println(el);
		}

		List<String> convertedSetTOList = hs.stream().collect(Collectors.toList());
		System.out.println(convertedSetTOList);
		
		
	}

}
