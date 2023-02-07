package commonExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HighestNumber {
public static void main(String[] args) {


	int[] a= {10,5,3,10,5,22,5,24,5};
	int highest=0;
	int secondHighest=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>highest) {
			secondHighest=highest;
			highest=a[i];
		}
	}
System.out.println(highest);
System.out.println(secondHighest);
    int a1= Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
     System.out.println(a1);
}
}
