package Lec08_02_Sept;

public class Synchronization {
	int count=0;
    synchronized public void increment()
	{
		count++;
	}
	
	public static void main(String[] args) {
		Synchronization s = new Synchronization();

		Thread t1 = new Thread(()->
		{
			for(int i=1;i<=1000;i++)
			{
				s.increment();
			}
		});
		
		Thread t2 = new Thread(()->
		{
			for(int i=1;i<=1000;i++)
			{
				s.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(s.count);
	}

}
