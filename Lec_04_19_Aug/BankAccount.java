package Lec_04_19_Aug;

public class BankAccount {
	public static void main(String[] args) {
		Customer b = new Customer();
//		b.balance=1000;
//		System.out.println(b.balance);
		System.out.println(b.getBalance());
	}
	
	

}

class Customer
{
	private double balance;
	
	public double getBalance()
	{
		return balance;
	}
}

// Bank has balance and deposit and withdraw and many more
