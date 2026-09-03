package Lec_04_19_Aug;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		try(FileReader fr = new FileReader("abc.txt");
			FileReader fr1 = new FileReader("wasif.txt");
				FileReader fr2 = new FileReader("Hello.txt")
				
				)
		{
			System.out.println("djdjdj");
		}
	}

}
