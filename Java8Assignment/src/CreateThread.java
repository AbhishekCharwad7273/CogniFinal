
public class CreateThread implements Runnable {
	
	public void run()
	{
		System.out.println("thread Are Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String str="abhishek";
		String nstr="";
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println(nstr);
		
		
		
		CreateThread th=new CreateThread();
		
		Thread t=new Thread(th);
		
		t.start();

	}

}
