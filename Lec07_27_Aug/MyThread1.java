package Lec07_27_Aug;

public class MyThread1 extends Thread{
	
	public void run()
	{
		for(int i=0;i<=500;i++)
		{
			System.out.println("GrandChild Class");
		}
	}

}
