package commonExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	
	public static void main(String[] args) {
		
		int[] a= {10,5,3,10,5,22,5,24,5};
		Integer[] wi= {10,5,3,10,5,22,5,24,5};
		List<Integer> wi1=Arrays.asList(wi);
		List<Integer> java8=Arrays.stream(wi).collect(Collectors.toList());
		System.out.println(java8);
		
		Set<Integer> java8s=Arrays.stream(wi).collect(Collectors.toSet());
		//for(Integer java8ee:java8s) {
			System.out.print("java8 set "+java8s);
	
		for(Integer wi2:wi1) {
			System.out.print(wi2);
		}
		int count=0;
		Arrays.asList(a);
		for(int a1:a) {
		System.out.print(" " +a1);
		}
		HashSet<Integer> wi3= new HashSet<>(wi1);
		System.out.print("wi3 hs "+wi3);
		HashSet<Integer> hs= new HashSet<>();
		
		for(int n:a) {
			if(!hs.add(n)) {
				//System.out.println(n);
				//count++;
			}
		}
		System.out.println("for each "+count);
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					//System.out.println(a[j]);
					break;
				}
				
			}
			
			//System.out.println(a[i]+" repeated "+count+ " times");
			//count=0;
		}
		System.out.println(count);
		//count=0;

		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]+" repeated "+count+ " times");
		}
	/*	long c=l.stream().filter(k->Collections.frequency(l, k)>1).distinct().count();
		System.out.println(c);*/
	}
	
}
