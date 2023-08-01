package JavaTrickyQuestion;

public class CountWords {

	public static void main(String[] args) {

		String str="welcomeToScriptlearners";
		int count=1;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				count++;
			}
		}
		
		System.out.println("Output is :="+count);

	}

}
