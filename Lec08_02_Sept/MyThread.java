package Lec08_02_Sept;

public class MyThread extends Thread{
	
	
	public void run()
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println("Child Thread");
		}
		run(2);
		
	}
	
	public void run(int j)
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.println("overload Thread");
		}
	}
	

}
