package JavaProgrammingQuestion;

import java.util.Arrays;

public class NonRepeatedString {

	public static void main(String[] args) {
		
		String str="teeter";
		for(char i:str.toCharArray())
		{
			if(str.indexOf(i)==str.lastIndexOf(i))
			{
				System.out.println("non repeating charcter is = "+i);
				break;
			}
			
		}
		
		
		Arrays.stream(str.split("")).distinct().forEach(System.out::println);

		
		
	}

}
