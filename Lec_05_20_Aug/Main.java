package Lec_05_20_Aug;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	public static void main(String[] args) {
//		interf i = ()-> System.out.println("Wasif");
//		i.m1();
		
//		interf i = (n)-> System.out.println(n*n);
//		i.square(3);
		
//		interf i = (a,b)->  a+b;
//		System.out.println(i.add(20, 400));
		
//		interf i = (n)-> n%2==0;
//		System.out.println(i.evenOrOdd(120));
		
//		Predicate<Integer> p = (n)-> n%2==0;
//		System.out.println(p.test(13));
		
		Predicate<String> p = (s)-> s.length()>5;
		System.out.println(p.test("Harshita"));
		
		Function<String, Integer> f = (s)-> s.length();
		System.out.println(f.apply("Harshita"));
		
		Function<Integer, Integer> f1 = (n)-> n*n;
		System.out.println(f1.apply(5));
		
		BiFunction<Integer, Integer, Integer> f2 = (a,b)-> a+b;
		System.out.println(f2.apply(20, 10));
		
		Supplier<List<Integer>>  s1 = ()-> {
			List<Integer> l = new ArrayList<Integer>();
			l.add(1);
			l.add(2);
			l.add(3);
			return l;
		};
		System.out.println(s1.get());
		
		Consumer<Integer> c = (n)-> System.out.println(n*n);
		c.accept(10);
		
		
		
		
	}

}
