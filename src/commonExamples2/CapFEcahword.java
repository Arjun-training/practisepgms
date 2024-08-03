package commonExamples2;

public class CapFEcahword {
	public static void main(String[] args) {
		String s1="this is arjun";
		String[] s2=s1.split(" ");
		String capFirstLetter="";
		
		for(int i=0;i<s2.length;i++) {
			String pass=s2[i];
			String before="";
			String after="";
			before=pass.substring(0,1).toUpperCase();
			after=pass.substring(1);
			capFirstLetter=before+after+" ";
			System.out.println(capFirstLetter);
		}
		//System.out.println(capFirstLetter);
		
		/*String s="this is arjun";
		String[] s1=s.split(" ");
		String fl="";
		for(int i=0;i<s1.length;i++) {
			fl=s1[i].substring(0,1).toUpperCase();
			fl=fl+s1[i].substring(1,s1[i].length());
			System.out.println(fl);
		}*/
		
	}

}
