package JavaTrickyQuestion;

public class StringComparisonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abhi";
		String s2="abhi";
		//String s1=new String("abhi");
		//String s2=new String("abhi");
		
		if(s1==s2)
		{
			System.out.println("s1==s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		if(s1.equals(s2))
		{
			System.out.println("String are equal");
		}
		else
		{
			System.out.println("String is not equal");
		}

	}

}
