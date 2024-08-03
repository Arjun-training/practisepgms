package commonExamples2;

public class CountEachWord {

	public static void main(String[] args) {
		String s="this.is.Arjun";
		String s1[]=s.split("\\.");
		int count=0;
		/*for(String s3:s1) {
			count++;
		}*/
		//System.out.println(count);
		String s2="";
		for(int i=s1.length-1;i>=0;i--) {
			//count++;
			s2+=s1[i]+".";
			System.out.print(s1[i]+".");
		}
		if(s2.contains("\\."))
	System.out.println(s2);
		
		/*String s="this is arjun";
		String[] s1=s.split(" ");
		String fl="";
		int count=0;
		for(int i=0;i<s1.length;i++) {
			count=s1[i].length();
			
			System.out.println(s1[i]+" "+count);*/
	}
}
