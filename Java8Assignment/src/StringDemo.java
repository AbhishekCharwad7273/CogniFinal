import java.util.Arrays;import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("Abhi");
		String s2="Abhi";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
		List<Integer>l=Arrays.asList(13,9,99,5,24,6);
		
		Integer maxNo = l.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).findFirst().get();
		System.out.println(maxNo);
		Integer max = l.stream().max(Comparator.comparing(Integer::intValue)).get();
		System.out.println(max);
	}

}
