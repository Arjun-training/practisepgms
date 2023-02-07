package commonExamples;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
	
	public static void main(String[] args) {
	dupicateString("ababaandham");
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
		
	}
}
