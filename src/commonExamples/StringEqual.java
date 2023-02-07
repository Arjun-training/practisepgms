package commonExamples;

public class StringEqual {

	public static void main(String[] args) {
		String s="Hello";
		String ss="Hello";
		System.out.println(s==ss);
		String s1=new String("Hello");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		String s2=s1.intern();
		
		System.out.println(s==s2);
		String s3=s.intern();
		System.out.println(s1==s3);
	}
}
