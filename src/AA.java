import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AA {
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		//Why can't abstract classes be instantiated?
		//because it contains abstract methods that do not have an implementation
		
		//Do you use interface or abstract class to achieve abstraction Why?
		//Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes? The reason is, abstract 
		//classes may contain non-final variables, whereas variables in interface are final, public and static.
		
		/*	collecton.foreach -> iterating over collection objects and cme thrown if any modification
			collection.stream.foreach -> converts int o stream then iterating and no error
			//both are almost same
			
			//why abstract class need to use over interface?
			//An abstract class allows you to create functionality that subclasses can implement or override. 
			
			
			component scan?
			//@ComponentScan is an annotation used in the Spring Framework for auto-detecting and registering Spring-managed components (e.g. beans, controllers, 
			 * services, repositories, etc.) within a specified package or set of packages.
			
			//@Configuration is used for defining beans and their dependencies,
			// whereas @Component is used for auto-detection of components.
			 
			ioc and di?
			//Dependency Injection is the method of providing the dependencies and 
			 //Inversion of Control is the end result of Dependency Injection.
			  
			diff bewtn service , component nd repo
			//@Component is a generic stereotype for any Spring-managed component.
			 // @Service annotates classes at the service layer. 
			 // @Repository annotates classes at the persistence layer, which will act as a database repository.
			*/
		String s="aaabbccccaee";//a3b2c4a1e2
		 
		List<String> l=Arrays.stream(s.split("")).collect(Collectors.toList());
		Map<String,Long> m1=l.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		for(Map.Entry<String,Long> m2:m1.entrySet()){
			//System.out.println(m2.getValue()+" "+m2.getKey());
			//break;
			}
		l.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().
				stream().map(p->p.getKey()+" "+p.getValue()).forEach(System.out::println);
		//System.out.println(sp);
		
		char[] c=s.toCharArray();
		HashMap<Character,Integer> hm= new HashMap<>();
		 
		for(int i=0;i<c.length;i++){
		if(hm.containsKey(c[i])){
		hm.put(c[i],hm.get(c[i])+1);
		}
		else{
		hm.put(c[i],1);
		}
		 
		}
		for(Map.Entry<Character,Integer> m:hm.entrySet()){
	//	System.out.println(m.getValue()+" "+m.getKey());
		}
	
	}
}

