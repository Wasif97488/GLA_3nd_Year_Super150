package Lec9_09_Sept;

public class Box {
	
	 volatile Integer item;
	volatile boolean hasItem=false;
	
	synchronized public void producer(int value)  throws InterruptedException
	{
//		System.out.println(hasItem);
		while(hasItem)
		{
			wait();
		}
		System.out.println("Item Produced "+ value);
		item=value;
		hasItem=true;
		notifyAll();
	}
	
	synchronized  public void consumer() throws InterruptedException
	{
		while(!hasItem)
		{
			wait();
		}
		System.out.println("Item Consumed "+item);
		item=null;
		hasItem=false;
		notifyAll();
	}

}
