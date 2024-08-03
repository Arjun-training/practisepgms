package commonExamples2;

import java.util.StringJoiner;

public class Reverse {

	public static void main(String[] args) {
		String sp="my.name.is.basu";
		String s=sp.replaceAll("\\.", " ");
		System.out.println(s);
	String rev="";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
	//System.out.println(s1[i]);
		//	System.out.print(s1[i]);
			String pass=s1[i];
			String revS="";
			for(int j=pass.length()-1;j>=0;j--) {
				revS+=pass.charAt(j);
			}
			System.out.print(revS+" "+"  2");
			rev+=revS+" ";
			}
		//System.out.println(rev+" "+" 1");
		
		}
		
	
}
