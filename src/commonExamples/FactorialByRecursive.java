package commonExamples;

public class FactorialByRecursive {
	public static void main(String[] args) {
		//findFactByrecursive(5);
		System.out.println(findFactByrecursive(5));
	}

	private static int findFactByrecursive(int a) {
		// TODO Auto-generated method stub
		/*for(int i=a-1;i>0;i--) {
			a=a*i;
		}
		System.out.println(a);*/
		if(a==0)
			return 1;
		return a*findFactByrecursive(a-1);
		
	}

}
