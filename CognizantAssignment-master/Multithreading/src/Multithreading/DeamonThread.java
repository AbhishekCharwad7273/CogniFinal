package Multithreading;

class ThreadDemo extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Thread is Deamon Thread");
		}
		else
		{
			System.out.println("Child Thread");
		}
	}
}




public class DeamonThread {

	public static void main(String[] args) {
	
		System.out.println("Main Thread");
		ThreadDemo td=new ThreadDemo();
		td.setDaemon(true);
		td.setDaemon(false);
		td.start();

	}

}
