package JavaProgrammingQuestion;

public class HalfPartUppercaseAndHalfPartLowercase {

	public static void main(String[] args) {
		
		String str="I Love India";
		
		int mid=str.length()/2;
		
		String lc="";
		String uc="";
		
		for(int i=0;i<str.length();i++)
		{
			if(i < mid)
			{
				lc=lc+Character.toLowerCase(str.charAt(i));
				
			}
			
			else
			{
				uc=uc+Character.toUpperCase(str.charAt(i));
			}
		}
		
		String finalString=lc+uc;
		
		finalString=finalString.replaceAll("\\s","");
		
		System.out.println(finalString);
	

	}

}
