package Multithreading;

class TestDrive extends Thread
{
	public void run ()
	{
		System.out.println("Test Drive Started");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test Drive Ended");
	}
}

class Medical extends Thread
{
	public void run()
	{
		System.out.println("Medical Started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Medical End");
	}
}

class Officer extends Thread
{
	public void run()
	{
		System.out.println("Officer Check Documents");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Officer Clear The Documents");
	}
}

public class JoinExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TestDrive td=new TestDrive();
		td.start();
		td.join(1000);
		
		Medical m=new Medical();
		m.start();
		m.join();
		
		Officer o=new Officer();
		o.start();
		o.join();
		
	}

}
