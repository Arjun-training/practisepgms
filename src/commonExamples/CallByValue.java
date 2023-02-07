package commonExamples;

public class CallByValue {
	int a=10;
	public static void main(String[] args) {
		CallByValue c= new CallByValue();
		System.out.println(c.a);
		//c.change(c);
		c.change(c);
		System.out.println(c.a);
	}
	private void change(CallByValue a1) {
		// TODO Auto-generated method stub
		a1.a=a1.a+300;
		//System.out.println(a);
	}

}
