package commonExamples2;

public class StringRotation {
public static void main(String[] args) {
	String s1="javavaq";
	String s2="ajavavz";
	
	if(s1.length()!=s2.length()) {
		System.out.println("Strings are not rotation each other");
	}
	else {
	String s3=s1+s1;
	if(s3.contains(s2)) {
		System.out.println("strings are rotaion each other");
	}
	else
		System.out.println("Strings are not rotation each other");
	}
}
}
