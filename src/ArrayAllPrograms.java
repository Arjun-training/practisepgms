import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayAllPrograms {

	public static void main(String[] args) {
		
	List<Integer> ll=Arrays.asList(1,2,3,4,5);
	
	//o/p-- 1,1,4,8,39,27
	//	ll.stream().map(e->e^2).forEach(System.out::println);
		ll=ll.stream().map(e->e^2).collect(Collectors.toList());
		System.out.println(ll);
		//even index as a output from //4,67,88,99,00
		
		
		int[] a= {1,4,8,9,1,3,4,9};
		Integer[] a1=Arrays.stream(a).boxed().toArray(Integer[]::new);
		List<Integer> l =new ArrayList<>(Arrays.asList(a1));
		
		//Integer max=l.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		//System.out.println(max);
		Integer maxi=l.stream().max(Comparator.naturalOrder()).get();
		System.out.println("maxi "+ maxi);
		Optional<Integer> maxi1=l.stream().max(Comparator.naturalOrder());
		
		
		
		
		System.out.println("maxi "+ maxi1.get());
		
		
		//IntSummaryStatistics ins=l.stream().collect(Collectors.summarizingLong())
		Integer maxx=l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(maxx);
		Integer min1=l.stream().sorted(Comparator.naturalOrder()).findAny().get();
		System.out.println(min1);
		//l.stream().distinct().forEachOrdered(System.out::println);
		//l.stream().filter(w->Collections.frequency(l, w)>1).forEach(System.out::println);
		System.out.println();
	//	long count=l.stream().filter(w->Collections.frequency(l, w)>1).count();
	//	System.out.println("count "+count);
		
		Map<Integer,Long> map=l.stream().filter(w->Collections.frequency(l, w)>1).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		//System.out.println(map);
		
		List<Integer> dup=l.stream().filter(w->Collections.frequency(l, w)>1).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet().stream().filter(p->p.getValue()>1).map( Map.Entry::getKey )
				.collect(Collectors.toList());
	//	System.out.println(dup);
		
		String s1="hellowelcome";
		List<String> ls=Arrays.stream(s1.split("")).collect(Collectors.toList());
	//	ArrayList<String> ls=(ArrayList<String>) Arrays.stream(s1.split("")).collect(Collectors.toList());
//String s=ls.stream().filter(i->i.compareTo(anotherString)).findFirst().get();
		Map<String,Integer> ms=ls.stream().collect(Collectors.toMap(Function.identity(),e->1,Math::addExact));
	System.out.println(ls);
	
	Map<String,Long> ms1=ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	//System.out.println(ms1);
	
	
	
	for(Map.Entry<String, Long> m1:ms1.entrySet()) {
		//if(m1.getValue()>1)
			//System.out.println(m1.getKey()+"---> "+m1.getValue());
		if(m1.getValue()==1)
			System.out.println("non repat " +m1.getKey());
	}
	//System.out.println("First non repeated");
	
	/*ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
	entrySet().stream().filter(p2->p2.getValue()==1).map(p2->p2.getKey()).collect(Collectors.toList());*/
	String sss=ls.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
	entrySet().stream().filter(p2->p2.getValue()==1).map(p2->p2.getKey()).findFirst().get();
	//System.out.println(sss);
	
//ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	IntSummaryStatistics ins=l.stream().mapToInt(x->x).summaryStatistics();
	//System.out.println(ins);
	
	System.out.println("First non repeated");
	
	Map<String,Long> ms2=ls.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	//System.out.println(ms1);
	
	
	
	for(Map.Entry<String, Long> m1:ms2.entrySet()) {
		//if(m1.getValue()>1)
			//System.out.println(m1.getKey()+"---> "+m1.getValue());
		if(m1.getValue()==1)
			System.out.println("non repat " +m1.getKey());
		break;
	}
	
	
	System.out.println();
	System.out.println("first repeated");
	String repeated=ls.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
	.entrySet().stream().filter(p3->p3.getValue()>1).map(p3->p3.getKey()).findFirst().get();
	System.out.println(repeated);
	}
}
