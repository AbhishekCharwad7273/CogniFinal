package String;

public class IntegerOutput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1;
		int j=10;
		
		do
		{
			if(i++>--j)
			{
				continue;
			}
		}while(i<5);
		{
			System.out.println("i="+i + " and j="+j);
		}
	}

	
	
	
	
}
