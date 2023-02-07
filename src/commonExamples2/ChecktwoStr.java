package commonExamples2;

import java.util.Arrays;

public class ChecktwoStr {
	public static void main(String[] args) {
		
		String s1="abcd";
		String s2="Bacd";
		boolean b;//=true;
		
		if(s1.length()!=s2.length()) {
		System.out.println("strings are not equal");	
		}
		else {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			char []c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			b=Arrays.equals(c1, c2);
			//System.out.println(Arrays.equals(c1, c2));
			if(b==true)
			System.out.println("two String are equal");
			if(b==false)
				System.out.println("two String are not equal");
			}
	}

}
