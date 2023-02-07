package Java8;

import java.util.ArrayList;import java.util.Comparator;
import java.util.List;

public class EmployeeList {
	public static void main(String[] args) {
		List<Employee> le= new ArrayList<Employee>();
		Employee e1=new Employee(1,"Arun",10000);
		Employee e2=new Employee(2,"Babu",40000);
		Employee e3=new Employee(3,"Akshay",10000);
		Employee e4=new Employee(4,"Arun",10000);
		
		le.add(e1);le.add(e2);le.add(e3);le.add(e4);
		//System.out.println(le);
		le.stream().forEach(System.out::println);
		//le.stream().map(e->e.getName()+ " " +e.getSalary()).forEach(System.out::print);
		//le.stream().map(Employee::getName).forEach(System.out::print);
		//le.stream().mapToDouble(Employee::getSalary);
		// long dl= le.stream().distinct().count();
		// System.out.println(dl);
	/*	le.stream().map(Employee::getName).sorted
		().forEach(System.out::print);*/
		//le.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId).reversed())
		//.forEach(System.out::println);
	}

}
