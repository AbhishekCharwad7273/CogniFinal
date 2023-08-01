package JavaTrickyQuestion;

class SingletonEx
{
	public static SingletonEx instance;
	
	private SingletonEx() {}
	
	public static SingletonEx getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonEx();
		}
		
		return instance;
	}
	
}



public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonEx instance=SingletonEx.getInstance();
		System.out.println(instance);
		
		SingletonEx instance1=SingletonEx.getInstance();
		System.out.println(instance1);
	
	}

}
