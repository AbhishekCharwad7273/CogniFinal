package Pattern;

import java.util.Arrays;

public class NormalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="AbhishekCharwad";
		int strMid=str.length()/2;
		String lc="";
		String uc="";
		
		for(int i=0;i<str.length();i++)
		{
			if(strMid<i)
			{
				lc=lc+Character.toLowerCase(str.charAt(i));
			}
			else
			{
				uc=uc+Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println(lc+uc);
		
		
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.printf("*");
			}
			System.out.println();

		}
		
	}

}
