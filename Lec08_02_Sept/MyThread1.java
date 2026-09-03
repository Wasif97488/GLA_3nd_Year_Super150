package Lec08_02_Sept;

public class MyThread1 extends Thread {
	
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println("MY Thread1 class");
		}
	}

}
