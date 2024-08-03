package prashant;

public class A {
	public static void main(String[] args) {
		boolean b=false;
		if(b==true) {
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		
		Float f=new Float("3.0");
		int x=f.intValue();
		byte b1=f.byteValue();
		double d=f.doubleValue();
		System.out.println(x+b1+d);
	}

}
