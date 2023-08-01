import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountryUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> country = Arrays.asList("usa", "japan", "france", "italy", "india", "canada");

		List<String> listOfCountryUpperCase = country.stream().map(j -> j.toUpperCase()).collect(Collectors.toList());
		System.out.println(listOfCountryUpperCase);
	}

}
