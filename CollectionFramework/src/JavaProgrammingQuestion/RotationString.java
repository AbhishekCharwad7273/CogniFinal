package JavaProgrammingQuestion;

public class RotationString {

	public static void main(String[] args) {
		
		
		String s1="ABCD";
		String s2="CDAB";
		
		
		if(isRotation(s1, s2))
		{
			System.out.println("Rotation Of string is present");
		}
		else
		{
			System.out.println("Rotation is not present");
		}
		
	}
	
	
	public static boolean isRotation(String s1,String s2)
	{
		return(s1.length()==s2.length())&&((s1+s2).indexOf(s2) != -1);
	}

}
