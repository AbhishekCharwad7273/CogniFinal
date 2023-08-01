

abstract class shape
{
	shape()
	{
		System.out.println("This is trangular shape");
	}
	
	public abstract void tringle();
	
}




public class AbstractClassDemo  extends shape{

	@Override
	public void tringle() {
		// TODO Auto-generated method stub
		System.out.println("This is a Tringle Method");
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AbstractClassDemo obj= new AbstractClassDemo();
	obj.tringle();	
	
	}



}
