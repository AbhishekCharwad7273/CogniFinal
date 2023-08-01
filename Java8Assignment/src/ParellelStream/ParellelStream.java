package ParellelStream;

import java.util.stream.IntStream;

public class ParellelStream {

	public static void main(String[] args) {
		
		long start=0;
		long end=0;
		
		start=System.currentTimeMillis();
		IntStream.range(1, 10).forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("plain stream take a time"+(end-start));
		
		
		start=System.currentTimeMillis();
		IntStream.range(1, 10).parallel().forEach(System.out::println);
		end=System.currentTimeMillis();
		System.out.println("Parelle stream take a time"+(end-start));
	}

}
