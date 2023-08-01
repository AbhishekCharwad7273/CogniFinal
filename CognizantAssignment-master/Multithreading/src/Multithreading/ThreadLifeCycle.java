package Multithreading;

class ThreadDemoLife implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("state of Thread1 while it called join() on Thread2 -"+ThreadLifeCycle.thread1.getState());
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


public class ThreadLifeCycle implements Runnable{
	
	
	public static ThreadLifeCycle tc;
	public static Thread thread1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tc=new ThreadLifeCycle();
		thread1=new Thread(tc);
		System.out.println("After creating Thread1 ="+thread1.getState());
		thread1.start();
		System.out.println("After created calling start()");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
