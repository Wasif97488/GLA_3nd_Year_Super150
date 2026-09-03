package Lec06_26_Aug;

public interface DefaultMethod {

	public void payment();
	
	default void refund()
	{
		System.out.println("Refund processing");
	}
	
}
