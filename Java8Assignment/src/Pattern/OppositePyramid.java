package Pattern;

public class OppositePyramid {
	
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((j+i)<=5)
				{
					System.out.print(" ");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}