package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ForEachExample {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		//Integer[] a=l.toArray(new Integer[l.size()]);//conversion from list to array
	//	l.stream().forEach(System.out::println);
		l.stream().distinct().collect(Collectors.toList()).forEach(System.out::print);
		System.out.println();
		long i=l.stream().filter(e->e%2==1).count();
		System.out.println(i);
		int min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		List<String> ls=new ArrayList<String>();
		ls.add("Hello");
		ls.add("welcome");
		ls.add("Arjun");
	String s1=	ls.stream().collect(Collectors.joining(" | "));
	System.out.println(s1);
		StringJoiner sj= new StringJoiner(",","[","]");
		sj.add("Arjun");
		sj.add("Bye");
		System.out.println(sj);
		
		System.out.println("-------------------optional -------------------------");
		String[] s=new String[10];
		String[] sa= {"hi","hello","how","are","you"};
		System.out.println(s.length);
		System.out.println(sa.length);
		String data=s[5];
		
		System.out.println(data);
		Optional<String> os=Optional.of(sa[4]);
		if(os.isPresent()) {
			//String data1=s[2];
			//
			System.out.println(os.get());
		}else {
			System.out.println("no value");
		}
		//System.out.println(os.get());
		Optional<String> os1=Optional.ofNullable(s[2]);
		if(os1.isPresent()) {
			//String data1=s[2];
			//
			System.out.println(os1.get());
		}else {
			System.out.println("no value");
		}
		//System.out.println(os1.get());
		
	}

}
