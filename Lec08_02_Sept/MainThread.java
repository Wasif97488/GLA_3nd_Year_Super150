package Lec08_02_Sept;

public class MainThread {
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
//		mt.run(2);
//		mt.run();
////		mt.run();
		
//		MyThread1 mt1 = new MyThread1();
//		mt1.start();
////		mt1.run();
//		
////		mt1.start();
////		mt.start();
		
		for(int i=1;i<=1000;i++)
		{
			try {
				System.out.println("Main Thread");
				Thread.sleep(1000);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	
		
		
	
	}

}
