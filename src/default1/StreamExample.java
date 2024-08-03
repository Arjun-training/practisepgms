package default1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java8Examples.Employee;

public class StreamExample {
    public static void main(String args[]) {
        Department hrDept = new Department(1, "HR");
        Department corpDept = new Department(2, "CORP");
        Department itDept = new Department(3, "IT");
        Map<Integer, Employee1> empMap = new HashMap<>();
        
        empMap.put(1, new Employee1(1, "Harsh", 1000L, "Harsh@gmail.com", hrDept));
        empMap.put(2, new Employee1(2, "Harshita", 2000L, "Harshitha@gmail.com", hrDept));
        empMap.put(3, new Employee1(3, "Harshad", 1000L, "Harshad@gmail.com", hrDept));
        empMap.put(4, new Employee1(4, "Harshneeta", 4000L, "Harshneeta@gmail.com", hrDept));
        empMap.put(5, new Employee1(5, "Harshal", 2000L, "Harshal@gmail.com", hrDept));
        empMap.put(6, new Employee1(6, "Harshali", 3000L, "Harshali@gmail.com", hrDept));
        empMap.put(11, new Employee1(11, "Harshi", 1000L, "Harsh@gmail.com", corpDept));
        empMap.put(12, new Employee1(12, "Harshita", 2000L, "Harshitha@gmail.com", corpDept));
        empMap.put(13, new Employee1(13, "Harshad", 1000L, "Harshad@gmail.com", corpDept));
        empMap.put(14, new Employee1(14, "Harshneeta", 4000L, "Harshneeta@gmail.com", itDept));
        empMap.put(15, new Employee1(15, "Harshal", 2000L, "Harshal@gmail.com", itDept));
        empMap.put(16, new Employee1(16, "Harshali", 3000L, "Harshali@gmail.com", itDept));
	highestSalaryInEachDepartment(empMap);
    }
 
public static void highestSalaryInEachDepartment(Map<Integer, Employee1> empMap) {
       /*
	Insert code here.
       */
	
	/*ArrayList<Employee> al= new ArrayList<>();*/
	
	//conversion
/*	List<Integer> listOfKeys 
    = empMap.keySet().stream().collect( 
        Collectors.toCollection(ArrayList::new)); 

// Java 8 code to convert map values to list 
List<Employee1> listOfValues1 
    = empMap.values().stream().collect( 
        Collectors.toCollection(ArrayList::new)); 
*/
	List<Integer> listkeys =	empMap.keySet().stream().collect( 
	         Collectors.toList());
System.out.println("-------------------------------------------------");
	 List<Employee1> listOfValues 
     = empMap.values().stream().collect( 
         Collectors.toList()); 
	 
	 		/*listOfValues.stream().collect(Collectors.groupingBy(Employee1::getDepartment,
			 Collectors.maxBy(Comparator.comparingLong(Employee1::getSalary))));*/
	 
	Map<Department, Optional<Employee1>> highestSalariesByDept=listOfValues.stream().collect(Collectors.groupingBy(Employee1::getDepartment,
			 Collectors.maxBy(Comparator.comparingLong(Employee1::getSalary))));
	
	highestSalariesByDept.forEach((dept, employee) -> {
        System.out.println("Department: " + dept.getDepartmentName() +
                ", Highest Salary: " + (employee.isPresent() ? employee.get().getSalary() : "N/A"));
    });
	
	for(Entry<Department, Optional<Employee1>> mm:highestSalariesByDept.entrySet()) {
	Long sal=mm.getValue().isPresent()?mm.getValue().get().getSalary():0L;
	System.out.println(mm.getKey().getDepartmentName()+" "+sal);

	}
	
	
/*	collecton.foreach
	collection.stream.foreach

	why abstract class need to use over interface?
	component scan?
	ioc and di?
	diff bewtn service , component nd repo*/
	 
	 


//	employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	//al.stream().map(Employee::getSalary).collect(Collectors.groupingBy(Employee::getDepartment);
	/*al.stream().collect(Collectors.groupingBy
			(Employee::getDepartment,Collectors.maxBy(Comparator.comparingInt(Employee::getId))));
	*/
	/*for(Map.Entry<Employee,Double> high:highSal){
	System.out.println(high.getKey().getDepartment()+" "+high.getValue());

}*/
    }
}
