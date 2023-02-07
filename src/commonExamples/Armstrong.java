package commonExamples;

public class Armstrong {
	public static void main(String[] args) {
		
		int n=153;
		int rem=0,sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
