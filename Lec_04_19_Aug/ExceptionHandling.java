package Lec_04_19_Aug;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.ConnectException;


public class ExceptionHandling {
	public static void main(String[] args) throws FileNotFoundException{
		
//		try
//		{
//			System.out.println("Hello");
//			System.out.println("GLA");
//			System.out.println(10/0);
//		}
//		catch (NullPointerException e) {
//			System.out.println("Exception handled");
//		}
//		finally {
//			System.out.println("finally block");
//		}
//		
		try
		{
			System.out.println(10/1);
			FileReader fr = new FileReader("abc.txt");
			
//			System.exit(0);
			System.out.println(10/1);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hadled");
		}
		finally {
//			fr.close();
		System.out.println("Finally");
		}
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			try
			{
				System.out.println(10/0);
			}
			catch(Exception f) {
				// TODO: handle exception
				System.out.println("Hello");
			}
		}
	}

}
