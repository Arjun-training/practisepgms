package commonExamples2;

public class ReverseToggle {
	public static void main(String[] args) {
		
		String s="this is arjun";
		String s1[]=s.split(" ");
		String revToggle="";
		
		//s.trim();
		System.out.println(s);
		for(int i=0;i<s1.length;i++) {
			String pass=s1[i];
			String revWord="";
			String first="";
			String last="";
			
			for(int j=pass.length()-1;j>=0;j--) {
					
			
				revWord+=pass.charAt(j);
				first=revWord.substring(0,1).toLowerCase();
				last=revWord.substring(1).toUpperCase();
				
			}
			revToggle+=first+last+" ";
			
		}
		System.out.println(revToggle);
	}

}
