package commonExamples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringCompare {

	public static void main(String[] args) {
		String s=new String("hello");
		String s1=new String("Bye");
		s=s1;
		System.out.println(s);
		
		Function<Integer,Integer> f=i -> i*2;
		f.apply(5);
		System.out.println(f.apply(10));
		
		Predicate<Integer> p=p1->(p1%2)==0;
		System.out.println(p.test(10));
		
		Consumer<String> c=c1->System.out.println(c1);
		c.accept("heelo");
	}
}
