package JavaProgrammingQuestion;

public class PrintSpecialCharactor {

	public static void main(String[] args) {
	
		
		String s="cloudtech@#$";
		String s1="";
		String rc="";
		
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i))&& !Character.isLetter(s.charAt(i))&& 
					!Character.isWhitespace(s.charAt(i)))
			{
				
				s1=s1+s.charAt(i);
			}
			else
			{
				rc=rc+s.charAt(i);
			}
		}
			
			System.out.println("special charcter are "+s1);
			System.out.println("Remaining charcter are "+rc);
		}
			

	

}
