package commonExamples;

public class RecursiveFib {
	public static void main(String[] args) {
		//fib(0);
		System.out.println(fib(0));
		System.out.println(fib(3));
		System.out.println(fib(5));
	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
	/*	int a=1,b=2,c=0;
		for(int i=0;i<5;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}*/
		if(n==0 || n==1) {
			return n;
		}
		else
		return fib(n-1)+fib(n-2);
	}

}
