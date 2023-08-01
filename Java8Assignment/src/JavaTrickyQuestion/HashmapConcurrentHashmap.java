package JavaTrickyQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashmapConcurrentHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<Integer, String>map=new HashMap<>();
		
		map.put(101, "abhi");
		map.put(102,"charwad");
		map.put(103, "hitesh");
		map.put(null,"sundar");
		
		System.out.println(map);
		
		Map<Integer, String>concurrent=new ConcurrentHashMap<>();
		concurrent.put(101, "abhi");
		concurrent.put(102,"charwad");
		concurrent.put(103, "hitesh");
		concurrent.put(null,"sundar");
		
		System.out.println(concurrent);
	}

}
