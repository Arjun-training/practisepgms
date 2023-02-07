package commonExamples;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		//System.out.println(" factorial");
		Scanner si=new Scanner(System.in);
		System.out.println("enter the number for factorial");
		int n=si.nextInt();
		//int n1=n;
		for(int i=n-1;i>0;i--) {
			n=n*i;
		}
		System.out.println(n);
		
	}

}
