package Multithreading;

public class ThreadPriority extends Thread {
	
	public void run()
	{
		System.out.println("Thread Priority");
		System.out.println("Child Thread Priority "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("After Changing Child Thread Priority "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Thread Priority "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("After Changing Main Priority Of Thread "+Thread.currentThread().getPriority());
		ThreadPriority tp=new ThreadPriority();
		tp.start();
	}

}
