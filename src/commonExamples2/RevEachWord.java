package commonExamples2;

public class RevEachWord {
	public static void main(String[] args) {
		String s1="this is Arjun";
		String[] s2=s1.split(" ");
		
		String revStr = "";
		for(int i=0;i<s2.length;i++) {
			String s3=s2[i];
			String revs3="";
			for(int j=s2[i].length()-1;j>=0;j--) {
				revs3=revs3+s3.charAt(j);
			}
			revStr+=revs3+" ";
		}
		System.out.println(revStr);
		
	}

}
