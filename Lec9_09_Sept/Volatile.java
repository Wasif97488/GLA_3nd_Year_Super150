package Lec9_09_Sept;

public class Volatile {
	
	volatile static boolean flag = true;
	
	public static void main(String[] args) throws InterruptedException{
		
		Thread t1 = new Thread(()-> {
			System.out.println("Enter into thread 1");
			while(flag)
			{
				
			}
			System.out.println("Exit from thread 1");
		});
		
		
		t1.start();
		Thread.sleep(1000);
		flag=false;
		System.out.println("exit from main Method");
	}
	

}
