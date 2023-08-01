package JavaTrickyQuestion;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Map<Integer, String> map = new HashMap<>();

			map.put(1, "abhi");
			map.put(53, "rahul");
			map.put(33, "meena");
			map.put(51, "Gana");
			map.put(3, "Nisha");

			System.out.println(map);

			Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
			System.out.println(synchronizedMap);

		}

		catch (IllegalArgumentException e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

}
