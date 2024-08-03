package concentrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import Java8.Employee;

public class Test {

	public static void main(String[] args) {
		
		List<Employee1> e=Arrays.asList(new Employee1(1,"a",100.0),
				new Employee1(2,"b",40.0),
				new Employee1(3,"c",50.0),
				new Employee1(4,"d",90.0),
				new Employee1(1,"a",100.0),
				new Employee1(2,"b",30.0),
				new Employee1(1,"a",50.0),
				new Employee1(4,"d",30.0)
				
						);
		
		List<Employee1> le= new ArrayList<Employee1>();
		Employee1 e1=new Employee1(1,"a",200.0);
		Employee1 e2=new Employee1(2,"b",300.0);
		Employee1 e3=new Employee1(3,"c",50.0);
		Employee1 e4=new Employee1(4,"d",10.0);
		Employee1 e5=new Employee1(1,"a",100.0);
		Employee1 e6=new Employee1(2,"b",30.0);
		Employee1 e7=new Employee1(1,"a",50.0);
		Employee1 e8=new Employee1(4,"d",30.0);
		le.add(e1);le.add(e2);le.add(e3);le.add(e4);le.add(e5);le.add(e6);le.add(e7);le.add(e8);
		
		
		//Collections.sort(le,new Employee().new ComparatorName());
		
		Collections.sort(le, new Comparator<Employee1>() {
			
            @Override
            public int compare(Employee1 e1, Employee1 e2)
            {
            	int a=e1.getId();
            	int b=e2.getId();
                    return  a-b;
            }
    });
		//System.out.println(le);
		//le.stream().filter(ep->ep.getId().size()>1).forEach((e)->System.out.print(e.getId()+" "+e.getSalary()));
	
		for(Employee1 ez:le) {
			
			//if(ez.id==le.g)
			//System.out.println(ez.getId());
		}
		
		for(int i=0;i<le.size();i++) {
			//if()
		}

 /*   for(int i=1;i<le.size();i++) {
            if(le.get(i-1).id.equals(le.get(i).id)) {
                    duplicates.add(original.get(i));
                    original.remove(i);
                    i = i -1;
            }
    }*/
		
		double totalSalByDept = le.stream().
				  filter(er -> 1 == er.getId())
				   .collect(Collectors.summingDouble(Employee1::getSalary));
System.out.println();
		
		Map<Integer, Long> empEachDept=le.stream().collect(Collectors.groupingBy(Employee1::getId,Collectors.counting()));
		//System.out.println(empEachDept);
		
		Set se=new HashSet();
		System.out.println(le);
		
		double sum=0;
		for(Employee1 er:le) {
			//System.out.println(er);
			
			
		}
		System.out.println(sum);
		//System.out.println(se);
		//	e.stream().filter(e)
		
		//le.stream().filter(e1.getId()==e2.getId()).
		//Double ee=le.stream().distinct().collect(Collectors.summingDouble(Employee::getSalary));
		//System.out.println(ee);
		//le.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).distinct().forEach(System.out::print);
		
		//le.stream().sorted(Comparator.comparing(Employee::getId)
		
		/*//System.out.println(ef);
		for(Employee eg:ef) {
			System.out.println(eg);
		}*/
		
		Iterator ee1=le.iterator();
		while(ee1.hasNext()) {
		Employee ee2=(Employee) ee1.next();
		//System.out.println(ee2.getId());
		//ee1.next().g
			
			}
		}
		
		
	
}
