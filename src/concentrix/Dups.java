package concentrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dups {
	
	public static void main(String[] args) {
		int[] a= {1,2,1,4,5,5};
		Integer[] a1=Arrays.stream(a).boxed().toArray(Integer[]::new);
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(a1));
		
		Map<Integer,Integer> m2=	al.stream().filter(i -> Collections.frequency(al, i) >1)
        .collect(Collectors.toMap(Function.identity(),e->1 ,Math::addExact));

		System.out.println("m2 "+m2);
		System.out.println();
		Map<Integer,Integer> m1=al.stream().collect(Collectors.toMap(Function.identity(),
				e->1 ,Math::addExact));
		System.out.println("int "+m1);
		System.out.println();
		for(Map.Entry<Integer, Integer> hm:m1.entrySet()){
			if(hm.getValue()>1)
			System.out.println(hm.getKey());
		}
		
		String s="Hello";
		List<String> l=Arrays.stream(s.split("")).collect(Collectors.toList());
		Map<String,Integer> m=l.stream().collect(Collectors.toMap(Function.identity(),e->1, Math::addExact));
		System.out.println();
		System.out.println(m);
		for(Map.Entry<String, Integer> hm:m.entrySet()){
			System.out.println(hm);
		}
		//al to aray
		ArrayList<Integer> alist= new ArrayList<>();
		alist.add(1);
		alist.add(9);
		Integer[] ia= new Integer[alist.size()];
		ia=alist.toArray(ia);
		//System.out.println(ia);
		for(Integer ia1:ia) {
		System.out.println(ia1);
		}
		
	}

}
