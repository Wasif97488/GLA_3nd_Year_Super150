package Lec08_02_Sept;

public class MyRunnable implements Runnable{
	
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println("My Runnable Thread");
		}
//		m1();
//		m2();
//		m3();
	}

}
