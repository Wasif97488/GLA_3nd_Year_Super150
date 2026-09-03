package Lec07_27_Aug;


public class MyThread extends Thread{
	
	public void run()
	{
		for(int i=0;i<=500;i++)
		{
			System.out.println("Child Class");
		}
	}
	
	public void run(int i)
	{
		for(int j=0;j<=500;j++)
		{
			System.out.println("Overloading Class");
		}
	}
	

}
