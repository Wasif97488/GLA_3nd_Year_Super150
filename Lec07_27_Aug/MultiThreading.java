package Lec07_27_Aug;

public class MultiThreading {
	
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		
//		mt.run(10);
		
//		mt.run();
		
//		mt1.start();
		
		for(int i=0;i<=1000;i++)
		{
			System.out.println("Parent Class");
		}
		MyThread1 mt1 = new MyThread1();
		mt.start();
		
		
	}

}
