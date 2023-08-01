package Multithreading;

public class CreateThreadRunnable implements Runnable{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateThreadRunnable cr=new CreateThreadRunnable();
		Thread t=new Thread(cr);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Create Thread Using Runnable Interface");
		
	}

}
