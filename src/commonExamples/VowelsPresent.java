package commonExamples;

public class VowelsPresent {

	public static void main(String[] args) {
		String s="HelloO";
		boolean b;
		b=s.toLowerCase().matches(".*[aeiou].*");
		System.out.println(b);
		
		String s1=s;
		System.out.println(s==s1);
		s="Bye";
		System.out.println(s==s1);
		String s4=null;
		System.out.println(s4);
		
	}
}
