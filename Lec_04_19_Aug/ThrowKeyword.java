package Lec_04_19_Aug;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowKeyword {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		System.out.println(10/0);
//		throw new InsufficientBalance("Insufficeint balance");
		
		try(FileReader fr = new FileReader("abc.txt"))
{
	
}
		
//	throw new ArithmeticException("cannot divide by zero Wasif");
	}

}


class InsufficientBalance extends RuntimeException
{
	
public InsufficientBalance(String message) {
	super(message);
	// TODO Auto-generated constructor stub
}
	
}

