package Lec9_09_Sept;

public class InterThreadCommunication {
	
	public static void main(String[] args) {
		
		Box b = new Box();
		Thread t1 = new Thread(()->
		{
			for(int i=1;i<=10;i++)
			{
				try
				{
					b.producer(i);
					Thread.sleep(2000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
		
		Thread t2 = new Thread(()->
		{
			try
			{
				for(int i=1;i<=10;i++)
				{
					b.consumer();
					Thread.sleep(2000);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		});
		
		t1.start();
		t2.start();
	}
	
	
	
	

}

