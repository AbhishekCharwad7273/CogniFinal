package Multithreading;

public class MultiThreadDemo extends Thread{
	
	public void run()
	{
		System.out.println("Multithreaded Enviournment");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiThreadDemo mt=new MultiThreadDemo();
		System.out.println(Thread.currentThread().getName());
		mt.start();
		
		MultiThreadDemo mt1=new MultiThreadDemo();
		System.out.println(Thread.currentThread().getName());
		mt1.start();
		

	}

}