package commonExamples;

public class Swap {

	public static void main(String[] args) {
		int x=11; int y=21;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("after swapping "+x+ " " +y);
		int temp=0;
		
		int a=1; int b=9;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("swapping usint temp "+a+" "+b);
		
	}
}
