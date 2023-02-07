package commonExamples;

public class SwapString {
	public static void main(String[] args) {
		String s="hi,hello";
		String[] s1=s.split(",");
		System.out.println(s1.length);
		for(int i=s1.length-1;i>=0;i--) {
		System.out.print(s1[i]+" ");
		}
		for(int i=0;i<s1.length;i++) {
			//System.out.print(s1[i]);
		}
		//System.out.println();
	}

}
