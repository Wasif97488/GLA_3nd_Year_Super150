package Lec08_02_Sept;

public class MainThread1 {
	
	public static void main(String[] args) throws InterruptedException{
		
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(()-> {
			for(int i=1;i<=1000;i++)
			{
				System.out.println("t class");
			}
		});
		
		Thread t1 = new Thread(()-> {
			for(int i=1;i<=1000;i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t1 class");
			}
		});
//		t.setPriority(10);
		t.start();
		t1.start();
		t.join();
		t1.join();
//		t.setPriority(10);
//		System.out.println(t.getPriority());

		for(int i=1;i<=1000;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
