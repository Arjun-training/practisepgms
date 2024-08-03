package prashant;

public class B extends A{
	public static void main(String[] args) {
		B b= new B();
		A a = new A();
		
		boolean b1;
		
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		System.out.println(b instanceof C);
	}

}
