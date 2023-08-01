import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void main(String[] args) {
		
		Map<String, String>map=new HashMap<>();
		
		map.put("abhi", "charwad");
		map.put("rahul", "nalawade");
		map.put("tuka", "tatya");
		map.put("shardul", "mohite");
		
		for(Map.Entry<String, String>entry : map.entrySet())
		{
			System.out.println("key = "+entry.getKey()+" Value = "+entry.getValue());
			
		}
		
		System.out.println("---------------------------------------------------------");
		
		for(Object str : map.keySet())
		{
			System.out.println("key = "+ str );
		}

		for( Object str1:map.values())
		{
			System.out.println("values = "+str1);
		}
		
		map.forEach((k,v)->System.out.println("Key is = "+k + " Value is = "+v));
	}

}
