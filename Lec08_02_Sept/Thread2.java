package Lec08_02_Sept;

public class Thread2 {

	public static void main(String[] args) {
		
	    Thread t = new Thread(()-> {
	    	for(int i=1;i<=1000;i++)
	    	{
	    		System.out.println("Thread class");
	    	}
	    });
//	    t.start();
	    
	    Thread t1 = new Thread(()-> {
	    	for(int i=1;i<=1000;i++)
	    	{
	    		System.out.println("Thread class");
	    	}
	    });
	    System.out.println(t.getName());
	    System.out.println(t1.getName());
	    
	    System.out.println(Thread.currentThread().getName());
	    t.setName("T thread");
	    t1.setName("T1 Thread");
	    System.out.println(t.getName());
	    System.out.println(t1.getName());
	    Thread.currentThread().setName("Main Thread");
	    System.out.println(Thread.currentThread().getName());


		
//		for(int i=1;i<=1000;i++)
//		{
//			System.out.println("Main Thread class");
//		}
	}
}
