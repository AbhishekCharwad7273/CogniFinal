package Multithreading;

public class CreateThread extends Thread{
	
	public void run()
	{
		System.out.println("Create Thread Using Thread Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateThread t=new CreateThread();
		t.start();
	}

}
