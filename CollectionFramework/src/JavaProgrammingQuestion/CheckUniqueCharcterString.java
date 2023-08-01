package JavaProgrammingQuestion;

public class CheckUniqueCharcterString {

	public static boolean checkunique(String in)
	{
		boolean result=false;
		
		for(char ch:in.toCharArray())
		{
			if(in.indexOf(ch)==in.lastIndexOf(ch))
			{
				result=true;
			}
			
			else
			{
				result=false;
			}
			
		}
		return result;
	}

	public static void main(String[] args) {
		
		boolean result=false;
		String ip="Alive is Awesome";
		String is="asdfghjkqwer";
		System.out.println(checkunique(ip));
		System.out.println(checkunique(is));
	}

}
