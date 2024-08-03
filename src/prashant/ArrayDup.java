package prashant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDup {

	
	public static void main(String[] args) {
		String[] s= {"sam","ram","ram","sam","sam","hi","hi","she","she"};
		String s1="";
		
		String s2="";
		List<String> l=Arrays.asList(s);
		l.stream().collect(Collectors.toSet()).forEach(System.out::println);
		int count=0;
		for(int i=0;i<s.length;i++) {
		
			for(int j=i+1;j<s.length;j++) {
			
				if(s[i]==s[j]) {
				//s2=s[j]+","+s[i];
					count++;
					//System.out.println(s[j]);
				}
				//count=0;
				//System.out.println(count);
				if(count==1) {
					//System.out.println(s[i]);
				}
			}
			count=1;
		}
		//System.out.println(s2);
	
	
		//using hashset
		HashSet<String> hs=new HashSet<String>();
		for(int i=0;i<s.length;i++) {
		 s1=s[i].toString();
		hs.add(s1);
		}
		 //System.out.println(hs);
		
	}
}
