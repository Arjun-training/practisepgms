package commonExamples;

public class PrimeCheck {
	
	public static void main(String[] args) {
		
		int n=7;
		boolean isprime=true;
		if(n==0 || n==1) {
			System.out.println("not prime");
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.println(n+" is prime no");
			}
			else {
				System.out.println(n+" is not prime no");
			}
		}
	}

}
