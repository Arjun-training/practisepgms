package commonExamples2;

public class CountEachWord {

	public static void main(String[] args) {
		String s="this is Arjun";
		String s1[]=s.split(" ");
		int count=0;
		/*for(String s3:s1) {
			count++;
		}*/
		//System.out.println(count);
		for(int i=0;i<s1.length;i++) {
			count++;
		}
		System.out.println(count);
	}
}
