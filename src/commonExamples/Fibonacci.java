package commonExamples;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,c = 0;
		Scanner si=new Scanner(System.in);
		System.out.println("enter a no ");
		int n=si.nextInt();
		System.out.print(a+" "+b);
		for(int i=0;i<n;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(" "+" "+c);
		}
		
	}
}
