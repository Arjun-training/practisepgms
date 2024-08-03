import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8Examples.Employee;

public class EmployeeList {
	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<Employee>();
		//List<Employee> employeeList1=new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Rade Joshi", 25, "FeMale", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
	
	//count male and female emps
		
		//sort by name followed by age followed by sal
		employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge).thenComparing(Employee::getSalary)).forEach(System.out::println);
		long a=employeeList.stream().filter(e->e.gender=="Male").count();
		System.out.println("male "+a);
	Map<String, Long> m=	employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	System.out.println(m);
	
	System.out.println("print all departments in the company");
	employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

	Map<String, List<Employee>> dept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
System.out.println();
System.out.println("avg age of male and female in the company");
	Map<String,Double> avgAge=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
	System.out.println(avgAge);
	System.out.println();
	System.out.println("Get highest sal in the organization?");
	Optional<Double> highSal1=employeeList.stream().map
			(Employee::getSalary).max(Comparator.naturalOrder());
	System.out.println(highSal1);
	Double highSal=employeeList.stream().map
			(Employee::getSalary).sorted(Comparator.reverseOrder()).findFirst().get();
System.out.println("HighSal "+highSal);
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))).entrySet().stream().map(e->e.getKey()+" "+e.getValue()).forEach(System.out::println);
System.out.println();
System.out.println("Get the details of highest paid employee in the organization?");
Employee empDetails=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();
//.collect(Collectors.groupingBy(Employee::getSalary));
System.out.println(empDetails);


System.out.println();
System.out.println("5.Get the names of all employees who have joined after 2015?");
employeeList.stream().filter(e->e.yearOfJoining<2015).map(Employee::getName).forEach(System.out::println);

System.out.println();

	

System.out.println("Count the number of employees in each department?");
Map<String,Long> dep=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
System.out.println(dep);
System.out.println();
System.out.println("What is the average salary of each department?");
Map<String,Double> avgSalDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(avgSalDept);
	for(Map.Entry<String, Double> mm:avgSalDept.entrySet()) {
		System.out.println(mm.getKey()+" "+mm.getValue());
	}
	System.out.println();
	System.out.println("Get the details of youngest male employee in the product development department?");
	Employee youngestMale=employeeList.stream().filter(e->e.getDepartment()=="Product Development" && e.gender=="Male").sorted(Comparator.comparingInt(Employee::getAge)).findFirst().get();
System.out.println(youngestMale);
System.out.println("Who has the most working experience in the organization?");
Optional<Employee> e=employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
Optional<Integer> ef=employeeList.stream().map(Employee::getYearOfJoining).min(Comparator.naturalOrder());
System.out.println("ef "+ef);
System.out.println(e);
Employee most=employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();
System.out.println("most "+most.getYearOfJoining());
Optional<Employee> e1=employeeList.stream().max(Comparator.comparing(Employee::getYearOfJoining));
System.out.println(e1);
System.out.println();

System.out.println(": How many male and female employees are there in the sales and marketing team?");
Map<String,Long> sales=employeeList.stream().filter(e2->e2.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy
		(Employee::getGender,Collectors.counting()));
	System.out.println(sales);
	
	System.out.println();
	
	System.out.println("What is the average salary of male and female employees?");
	Map<String,Double> avgMFSal=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(avgMFSal);
	System.out.println();
	System.out.println("List down the names of all employees in each department?");
	Map<String, List<Employee>> ename=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	
	//System.out.println(ename);
	for(Map.Entry<String, List<Employee>> lm:ename.entrySet()) {
		System.out.println(lm.getKey()+" ");
		List<Employee> name=lm.getValue();
		for(Employee e4:name) {
			System.out.println(e4.getName());
		}
	}
//	employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream().map(f1->f1.getValue().stream().map(Employee::getName).forEach(System.out::println);
	
	System.out.println();
	System.out.println("What is the average salary and total salary of the whole organization?");
	Double avgSal1=employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	Double totalSal1=employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
	System.out.println(avgSal1+"  "+totalSal1);
	DoubleSummaryStatistics dd=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	System.err.println(dd.getAverage()+" "+dd.getSum()+" "+dd.getCount()+" "+dd.getMax());
	System.out.println();
	System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years");
	employeeList.stream().filter(e5->e5.getAge()<=25).forEach(System.out::println);
	System.out.println();
	System.out.println("find out years of experience each emp>10");
	Stream<Employee> el=employeeList.stream().filter(e7->LocalDate.now().getYear()-e7.getYearOfJoining()>=10);
	
	System.out.println(e1.get().getName());

	
	//System.out.println(LocalDate.now().getYear());
	System.out.println();
	

Map<String, List<Employee>> e8=employeeList.stream().filter(k->LocalDate.now().getYear()-k.getYearOfJoining()>=10).collect(Collectors.groupingBy(Employee::getName));

for(Map.Entry<String, List<Employee>> msl:e8.entrySet()) {
	
	//System.out.println(msl.getKey());
	List<Employee> e10=msl.getValue();
	for(Employee e9:e10) {
		System.out.println(e9.getYearOfJoining()+" " +e9.getName());
	}
	
	}

}
}