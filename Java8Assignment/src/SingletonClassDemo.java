
public class SingletonClassDemo {

	private static SingletonClassDemo single_instance=null;
	
	private SingletonClassDemo()
	{
		
	}
	
	public static SingletonClassDemo getInstance()
	{
		if(single_instance==null)
		{
			single_instance=new SingletonClassDemo();
			
		}
		return single_instance;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonClassDemo obj=new SingletonClassDemo();
		SingletonClassDemo obj1=new SingletonClassDemo();
		
		
		System.out.println(obj.getInstance());
		System.out.println(obj1.getInstance());
	}

}
