import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {
	
	public static void main(String[] args) {
		
		int[] a1= {11,2,7,5,17,2,7,13};
		Integer[] a = Arrays.stream( a1 ).boxed().toArray( Integer[]::new );//int [] to integer[]
		Integer[] ever = IntStream.of( a1 ).boxed().toArray( Integer[]::new );
		
		List<Integer> al= Arrays.asList(a);
		
		//Arrays.stream(a1).filter(e->Collections.frequency(Arrays.stream(a1), e)>1).collect(Collectors.toSet());
		//al.stream().distinct().collect(Collectors.toSet()).forEach(System.out::println);
	//	al.stream().filter(e->).forEach(System.out::println);
		al.stream().filter(e->Collections.frequency(al, e)>1).collect(Collectors.toSet()).forEach(System.out::println);
		
		System.out.println();
		
		Set<Integer> s=al.stream().filter(e->Collections.frequency(al, e)>1).collect(Collectors.toSet());
		System.out.println(s);
		
		List<Integer> duplicates = IntStream.of( 1, 2, 3, 2, 1, 2, 3, 4, 2, 2, 2 )
				   .boxed()
				   .collect( Collectors.groupingBy( Function.identity(), Collectors.counting() ) )
				   .entrySet()
				   .stream()
				   .filter( p -> p.getValue() > 1 )
				   .map( Map.Entry::getKey )
				   .collect( Collectors.toList() );
		System.out.println("dups "+duplicates);
		
		String s1="hellowelcome";
		//char[] c1=s1.toCharArray();
		List<String> al1=Arrays.stream(s1.split("")).collect(Collectors.toList());
		System.out.println(al1);
		Map<String,Integer> m=al1.stream().collect(Collectors.toMap(Function.identity(),
				e->1,Math::addExact));
		System.out.println(m);
		for(Map.Entry<String, Integer> hm:m.entrySet()) {
			if(hm.getValue()>1)
		System.out.println(hm.getKey()+" "+hm.getValue());
		}
		//Math.
		
		
	}

}
