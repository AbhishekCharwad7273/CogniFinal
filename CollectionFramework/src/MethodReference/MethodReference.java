package MethodReference;

import java.util.function.Function;

public class MethodReference {

	
	static Function<String, String>toUppercaselambda=(s)->s.toUpperCase();

	static Function<String, String>toUppercaseMethodReference=String::toUpperCase;
	
	public static void main(String args[])
	{
		System.out.println(toUppercaseMethodReference.apply("abhishek"));
		
		System.out.println(toUppercaselambda.apply("charwad"));
		
		
	}
}
