package JDBC;
import java.util.*;
public class AA {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(10);
		a.add("Wasif");
		a.add(true);
		a.add(10.5);
		System.out.println(a);
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		
//		ArrayList<Object> al1 = new ArrayList<>();
//		al1.add(10);
//		al1.add(true);
//		al1.add("Wasif");
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(35);

		hs.add(45);

		System.out.println(hs);
	}

}
