import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class BB {
	
	public static void main(String[] args) {
		
	/*	Map<String, Employee> map = new HashMap<>();

		Employee employee1 = new Employee(1L, "Mher");
		map.put(employee1.getName(), employee1);
		Employee employee2 = new Employee(22L, "Annie");
		map.put(employee2.getName(), employee2);
		Employee employee3 = new Employee(8L, "John");
		map.put(employee3.getName(), employee3);
		Employee employee4 = new Employee(2L, "George");
		map.put(employee4.getName(), employee4);*/
	/*	AA a= new AA(1,"Arun",100.0);
		AA a1= new AA(3,"Barun",500.0);
		AA a2= new AA(4,"Nikish",9000.0);
		AA a3= new AA(8,"Ak",400.0);
		AA a4= new AA(8,"Basu",400.0);
		HashMap<AA,Integer> h= new HashMap<AA,Integer>();
		h.put(a, 10);
		h.put(a1, 30);
		h.put(a2, 60);
		h.put(a3, 80);
		h.put(a4, 80);
		//System.out.println(h);
		Collection<Integer> cc=h.values();
		ArrayList<Integer> al=new ArrayList<>(cc);
		System.out.println(al+" "+"am");*/
		

		//h.entrySet().stream().sorted(Map.Entry.<AA,Integer>comparingByKey()
	//			.thenComparing(Map.Entry.<AA,Integer>comparingByValue())).forEach(System.out::println);
		
		//h.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.<AA,Integer>comparingByKey())).forEach(System.out::println);
		//Collections.sort(h);
		
		//h.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.<AA,Integer>comparingByValue())).forEach(System.out::println);
		
		
		
		//spliterator
		//Iterator can be used to traverse only Collection types. 
		//But using Spliterator , you can traverse collections, arrays, and streams.
		/*Iterator										Spliterator
		It performs only iteration.						It performs splitting as well as iteration.
		Iterates elements one by one.					Iterates elements one by one or in bulk.
		Most suitable for serial processing.			Most suitable for parallel processing.
		Iterates only collection types.					Iterates collections, arrays and streams.
		Size is unknown.								You can get exact size or estimate of the size.
		Introduced in JDK 1.2.							Introduced in JDK 1.8.
		You can’t extract properties of the iterating elements.	You can extract some properties of the iterating elements.
		External iteration.								Internal iteration.*/
		
		//compltetableFuture
		//Future: Primarily relies on blocking operations (get()) for retrieving the result of the asynchronous computation. CompletableFuture: Encourages non-blocking programming. It allows us to process results with functions 
		//and actions that get applied asynchronously, thus enhancing the responsiveness of your application.
		//We can use it to compose multiple asynchronous operations, handle errors and exceptions, and combine multiple CompletableFutures into one. 
		
		//why chm? in which its used
		//ConcurrentHashMap is the Map implementation that allows us to modify the Map while iteration. The ConcurrentHashMap operations are thread-safe. 
		//ConcurrentHashMap doesn't allow null for keys and values.
		//While iterating over a hashmap using an iterator, if we try to modify the structure of the map(i.e. the number of entries (either remove or put a new entry in the map)), then we get ConcurrentModificationException . 
		//To get rid of this exception and to change the structure of the map we should use ConcurrentHashMap 
		
		//what intern method do
		
		//type intereferance
		
		//scope of variable in interface
		//scopes in java - local, instance, class, and method parameters
		
		//diff between findfirst and findany
		//first element return and find any return random element
		
		//suppose if u get 404 exception from production , how will u check logs for the particular user who is having resource and resolve
		//write test case for post method in junit ex:users
	}
	
	
	
}
