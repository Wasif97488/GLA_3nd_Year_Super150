package Lec06_26_Aug;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import Lec_05_20_Aug.interf;

public class MethodReference {
	
	public static void main(String[] args) {
		System.out.println(square(10));;
		
		Consumer<Integer> c = (n)-> System.out.println(square(20));
		Function<Integer, Integer> c1 = MethodReference::square;
	System.out.println(c1.apply(25));;
		c.accept(20);
		
		MethodReference m = new MethodReference();
	BiFunction<Integer, Integer, Integer> bf = m::add;
		System.out.println(bf.apply(20, 5));;
		
		Consumer<Integer> c2 = (n)-> System.out.println(n);
		
		Consumer<Integer> c3 = System.out::println;
		c3.accept(65);

		c2.accept(20);
		
		Function<Integer, Integer> f1 = (n)-> (int)Math.sqrt(n);
		System.out.println(f1.apply(9));;
		
		Function<Integer, Double> f3 =Math::sqrt;
		System.out.println(f3.apply(16));

	}
	public static int square(int n)
	{
		return n*n;
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}

}
