package Lec9_09_Sept;

public class Synchronization {
	
	int count=0;
	
	synchronized public  void increment()
	{
//		count++;
		System.out.println("Wasif");
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		Synchronization s = new Synchronization();
		
		Thread t1 = new Thread(()->{
			for(int i=1;i<=1000;i++)
			{
				s.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1;i<=1000;i++)
			{
				s.increment();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(s.count);
	}

}
