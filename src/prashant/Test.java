package prashant;

public class Test {
	
	public static void main(String[] args) {
		String s="1-abc,2-xyz,3-pqr";
		String[] s1=s.split(",");
		String s2="";
		for( int i=0;i<s1.length;i++) {
			
			s1[0]=s1[0].concat("|");
			s1[1]=s1[1].concat("|");
			 s2=s1[i].substring(2, s1[i].length());
			 System.out.print(s2);
		}
		
		
	}

}
