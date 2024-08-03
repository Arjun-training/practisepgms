package commonExamples2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveFirstOccurance {

	
	public static void main(String[] args) {
		String s="hello";
		char[] cc=s.toCharArray();
		List ll=Arrays.asList(cc);
		((Iterable) ll.stream().filter(i -> Collections.frequency(ll, i) >1)
        .collect(Collectors.toSet())).forEach(System.out::println);
	//System.out.println(ss);
		/*StringBuilder sb= new StringBuilder(s)	;	
	for(int i=0;i<s.length();i++) {
		int count=0;
		
		for(int j=0;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
		}
		//System.out.println(count);
		if(count==2) {
			
			sb=sb.deleteCharAt(i);
			System.out.println(sb);
			break;
		}
		//count=0;
	}*/
	
        //System.out.println(s);
		/*char[] c=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(Character c1:c) {
			if(hm.containsKey(c1)) {
				hm.put(c1, hm.get(c1)+1);
			}else {
				hm.put(c1, 1);
			}
		}
		//System.out.println("Charactes repeated no of times are");
		Set<Character> sc=hm.keySet();
		System.out.println(sc);
		String s1=new String();
		String s2=s1.valueOf(sc);
		System.out.println(s2);
		*/
		
		//char[] to string
	/*	if 
		char[] a= {1,2,3,4};
		String s1=new String();
		String s2=s1.valueOf(a);or copyValueOf(a) or
		String s3=new String(a); or using StringBuilder*/
	/*	StringBuilder sb= new StringBuilder();
		for(char cc:sc) {
			sb.append(cc);
		}
		String s3=sb.toString();
		System.out.println(s3);*/
				
		
		//System.out.println(hm);
		/*for(Map.Entry<Character, Integer> m:hm.entrySet()) {
			//System.out.println(m.getKey()+"------> "+m.getValue());
			//if(m.getValue()>1) {
				System.out.print(m.getKey()+"------> "+m.getValue());
			//}
		}*/
		
		
	}
}
