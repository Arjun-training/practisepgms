package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeList {
	public static void main(String[] args) {
		int a[]={1,2,3,5,6,8};

		int n1=(a.length)*(a.length+1)/2;
		int n2 = 0;
		int diff=a[0]
				;
		for(int i=0;i<a.length;i++){
			 if (a[i] - i != diff)
		        {
		 
		            // Loop for consecutive
		            // missing elements
		            while (diff < a[i] - i)
		            {
		                System.out.print((i + diff) + " ");
		                diff++;
		            }
		        }
		}
		System.out.println("missing");
		
		ArrayList al=new ArrayList();
		al.add(10);al.add(20);
		al.stream().forEach(System.out::println);
		al.forEach((e)->{
		System.out.println(e);
		});
		List<Employee> le= new ArrayList<Employee>();
		Employee e1=new Employee(1,"Arun",10000);
		Employee e2=new Employee(2,"Babu",40000);
		Employee e3=new Employee(3,"Akshay",10000);
		Employee e4=new Employee(4,"Arun",10000);
		
		le.add(e1);le.add(e2);le.add(e3);le.add(e4);
		//System.out.println(le);
		le.stream().forEach(System.out::println);
		le.stream().map(Employee::getSalary).collect(Collectors.toSet()).forEach(System.out::println);
		le.stream().map(Employee::getSalary).distinct().forEach(System.out::println);
		//distinct salary with employee details
		//Map<Double,Employee> e=le.stream().collect(Collectors.groupingBy(Employee::getSalary,Collectors.)));
		//le.stream().map(e->e.getName()+ " " +e.getSalary()).forEach(System.out::print);
		//le.stream().map(Employee::getName).forEach(System.out::print);
		//le.stream().mapToDouble(Employee::getSalary);
		// long dl= le.stream().distinct().count();
		// System.out.println(dl);
	/*	le.stream().map(Employee::getName).sorted
		().forEach(System.out::print);*/
		//le.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId).reversed())
		//.forEach(System.out::println);
		
		List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		List<String> l1=list.stream().distinct().collect(Collectors.toList());
		System.out.println(l1);
		Set<String> set=list.stream().collect(Collectors.toSet());
		System.out.println(set);

		String s="i am a java developer and good in java";

		String[] s1=s.split(" ");
		char[] c1=s.toCharArray();
		int count=0;

		HashMap<Character,Integer> h=new HashMap<Character,Integer>();

		for(Character s2:c1){

		if(h.containsKey(s2)){

		h.put(s2,h.get(s2)+1);
		}
		else{
		h.put(s2,1);
		}
		
	}
		for(Map.Entry<Character, Integer> h1:h.entrySet()) {
			System.out.println(h1.getKey()+" "+h1.getValue());
		}
	}
}
