package MapFlatmap;

import java.util.stream.Stream;

public class SumStreamMap {
	

	public static void main(String[] args) {

		System.out.println(Stream.of(1, 24, 54, 23, 13).reduce(0, (a, b) -> a + b));
		//reduce(identity,accumalator)
		//here 0 is the initial value of reduce function
		//Accumalator:(a,b)->a+b function
	}

}
