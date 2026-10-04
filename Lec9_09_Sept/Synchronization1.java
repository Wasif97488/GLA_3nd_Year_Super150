package Lec9_09_Sept;

public class Synchronization1 {
	Synchronization1 s1 = new Synchronization1();
	Synchronization1 s2 = new Synchronization1();
	public static void main(String[] args) {
		

		Thread t1 = new Thread(()->
		{
			s1.m1();
			
		});
		
		Thread t2 = new Thread(()->
		{
			s1.m1();
		});
		
		t1.start();
		t2.start();
		
		
	}
	  public static  void m1()
	{
		System.out.println("Enter into Thread");
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}	
		//20 // 30 line ode 
		//dndjjdjdjdjjdjd
	     synchronized(Synchronization1.class) {
			//fhhfhfhfhfhf
		}
		System.out.println("Exit from Thread");
	}
	  
	  synchronized(Synchronization1.class) {
			//fhhfhfhfhfhf
		}
}
