package Pattern;

public class AdditionPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.printf("%d",no);
				no++;
			}
			System.out.println();
		}

	}

}
