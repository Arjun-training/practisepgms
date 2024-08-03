import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8 {
	public static void main(String[] args) {
		
		int a[]= {10,3,6,8,4,3,9};
		Integer[] a1=Arrays.stream(a).boxed().toArray(Integer[]::new);
		List<Integer> l=Arrays.asList(a1);
		System.out.println("separate odd and even");
		System.out.println("even numbers ");
		l.stream().filter(i->i%2==0).forEach(System.out::println);
		System.out.println("odd numbers ");
		l.stream().filter(i->i%2!=0).forEach(System.out::println);
		System.out.println();
		int i=45623;
		IntSummaryStatistics in=Stream.of(String.valueOf(i).split("")).collect(Collectors.summarizingInt(Integer::parseInt));
		System.out.println("in "+in);
		System.out.println("find sum of i");
		int sum=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(sum);
		System.out.println();

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing(String::length))
        .forEach(System.out::println);
         System.out.println("reverse ");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).sorted(Comparator.reverseOrder()).forEach(System.out::println);        
	System.out.println();
	System.out.println("Common elements in 2 array");
	 List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
     
     List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
      
     list1.stream().filter(list2::contains).forEach(System.out::println);
     
     System.out.println();
     System.out.println("reverse each word in own place ");
     String str = "Java Concept Of The Day";
     List<String> ll=Arrays.stream(str.split(" ")).collect(Collectors.toList());
     ll.stream().map(e->new StringBuffer(e).reverse()).forEach(System.out::println);
     

	}

}
