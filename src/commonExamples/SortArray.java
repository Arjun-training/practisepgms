package commonExamples;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray {
	public static void main(String[] args) {
		int[] a= {10,5,3,10,5,22,5,24,5};
	//	System.out.println(a.length);
		//Arrays.sort(a,Collections.reverseOrder());
		Arrays.sort(a);
		//System.out.println(a);
		for(int a1:a) {
			System.out.println(a1);
		}
		int a2=
				Arrays.stream(a).boxed().sorted().findFirst().get();
		System.out.println(a2);
		int a3=Arrays.stream(a).sorted().findFirst().getAsInt();
		System.out.println(a3);
		/*
		 * public class Test{
		 * 
		 * private static Test t;
		 * private Test(){
		 * }
		 * public static Test getTest(){
		 * 
		 * while(true){
		 * synchronized(Test.class){
		 * Test t= new Test();
		 * }
		 * }
		 * 
		 * }
		 * 
		 */
	}

}
