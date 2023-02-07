package commonExamples2;

public class Toggle {
	public static void main(String[] args) {
		String s="this is arjun";
		String []s1=s.split(" ");
		String toggle="";
		
		for(int i=0;i<s1.length;i++) {
			String pass=s1[i];
			String first="";
			String after="";
			first=pass.substring(0,1).toLowerCase();
			after=pass.substring(1).toUpperCase();
			toggle=first+after+" ";
			System.out.println(toggle);
		}
		//System.out.println(toggle);
	}

}
