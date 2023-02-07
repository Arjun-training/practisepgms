package commonExamples;

public class ReverseString {

	public static void main(String[] args) {
		String s1="Hello";
		reverse(s1);
	}

	private static void reverse(String s) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--) {
			rev+=s.charAt(i);
			
		}
		System.out.println(rev);
	}
}
