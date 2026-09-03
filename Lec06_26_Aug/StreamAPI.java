package Lec06_26_Aug;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(9,3,10,10,20,10,20,17,30,0,11,7,3,30);
		Stream<Integer> s=l.stream();
//		s.forEach((System.out::println));
		
//		l.stream().filter((n)-> n%2!=0).forEach(System.out::println);
		
//		l.stream().filter((n)-> n>10).forEach(System.out::println);
		
//		l.stream().map((n)-> n*n).filter((p)-> p%2!=0).forEach(System.out::println);
		
		List<String> li = Arrays.asList("Wasif","Hello","vansh","Johnson","vatika");

//		li.stream()
//		.filter((p)-> p.length()>5)
//		.map(String::toUpperCase)
//		.forEach(System.out::println);
		
	List<String> list=	li.stream()
		.filter((p)-> p.length()>5)
		.map(String::toUpperCase).toList();
	
//	l.stream().filter(n->n%2!=0).distinct().forEach(System.out::println);
	
	
//	l.stream().filter(n-> n%2==0).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
//	long count=l.stream().filter(n-> n%2!=0).count();
//	System.out.println(count);
//	Optional<Integer> o=  l.stream().max(Integer::compare);
//	System.out.println(o.get());
//	
//	Optional<Integer> o1=  l.stream().min(Integer::compare);
//	System.out.println(o1.get());
	
//	Optional<Integer> o2=l.stream().sorted(Comparator.reverseOrder()).findFirst();
//	System.out.println(o2.get());
	
//	l.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);;
//	int n=6;
//	l.stream().sorted().limit(3).forEach(System.out::println);;
	
//	l.stream().sorted().skip(3).forEach(System.out::println);

	l.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).limit(1).forEach(System.out::println);;
	


	}

}
