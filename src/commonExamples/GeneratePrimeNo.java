package commonExamples;

import java.util.LinkedList;
import java.util.Scanner;

public class GeneratePrimeNo {
	
	public static void main(String[] args) {
		
		//LinkedList<Integer> ll=new LinkedList<>();
	//	boolean prime=true;
		Scanner si=new Scanner(System.in);
		System.out.println("Enter a number till you want prime numbers");
		int n1=si.nextInt();
		//int n=n1;
		int flag;
		for(int i=1;i<=n1;i++) {
			if(i==0 || i==1)
				continue;
			flag=1;
	
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println(i);
		}
		
		}
		//System.out.println(ll);
		
	}

}
