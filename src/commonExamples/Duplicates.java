package commonExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
	
	public static void main(String[] args) {
	dupicateString("ababaandham");
	String ss="Ababtggsd";
	List<String> ls=Arrays.asList(ss.split(""));
//	System.out.println(ls);
	Map<String,Long> m=ls.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	System.out.println(m);
	}

	private static void dupicateString(String s) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(Character c1:c) {
			if(hm.containsKey(c1)) {
				hm.put(c1, hm.get(c1)+1);
			}else {
				hm.put(c1, 1);
			}
		}
		System.out.println("Charactes repeated no of times are");
		System.out.println(hm);
		for(Map.Entry<Character, Integer> m:hm.entrySet()) {
			//System.out.println(m.getKey()+"------> "+m.getValue());
			if(m.getValue()>1) {
				System.out.println(m.getKey()+"------> "+m.getValue());
			}
		}
		/*tring s="abavabcdh";
		char[] c=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			if(hm.containsKey(c[i])) {
				hm.put(c[i], hm.get(c[i])+1);
			}
			else {
				hm.put(c[i], 1);
			}
			//System.out.println(c[i]);
		}
		for(Map.Entry<Character, Integer> hh:hm.entrySet()) {
			if(hh.getValue()>1)
			System.out.println(hh.getKey()+" "+hh.getValue());
			if(hh.getValue()>1)
				System.out.println(hh.getKey());
			
		}*/
		
		
	}
}
