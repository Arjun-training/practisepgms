package java8Examples;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeListClass {
	
	public static void main(String[] args) {
		
	List<Employee> employeeList=new ArrayList<Employee>();
	List<Employee> employeeList1=new ArrayList<Employee>();
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
	employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
	employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
	employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
	employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
	employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
	employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

	System.out.println("------------------------Questions--------------------");
	System.out.println("How many male and female employee in the company ");
	//long a=employeeList.stream().filter(e->e.gender()="Male").count();
	System.out.println();
     Long malecount=employeeList.stream().filter(e->e.getGender()=="Male").count();
     System.out.println(malecount);
	Map<String,Long> m=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	
	System.out.println(m);
	System.out.println();
	System.out.println("print all departments in the company");
	
	employeeList.stream().map(Employee::getDepartment).distinct()
	.forEach(System.out::println);
	
	System.out.println();
	
	System.out.println("avg age of male and female in the company");
	
	Map<String,Double> avgAge=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
	
	System.out.println(avgAge);
	System.out.println();
	System.out.println("Get the details of highest paid employee in the organization?");
	
	Employee highestSal=employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();
	System.out.println(highestSal);
	Double ee=highestSal.getSalary();
	System.out.println(ee);
	
	Optional<Employee> d=employeeList.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
	System.out.println(d.get());
	Employee e=d.get();
	System.out.println(e.getSalary());
	System.out.println();
	
	System.out.println("5.Get the names of all employees who have joined after 2015?");
	
	employeeList.stream().filter(e2->e2.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
	System.out.println();
	System.out.println("Count the number of employees in each department?");
	Map<String,Long> empEachDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	System.out.println(empEachDept);
	System.out.println();
	System.out.println("What is the average salary of each department?");
	System.out.println();
	Map<String,Double> avgSalOfEachDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(avgSalOfEachDept);
	Set<Map.Entry<String,Double>> set=avgSalOfEachDept.entrySet();
	for(Map.Entry<String, Double> d1:set) {
		System.out.println(d1.getKey()+ " " +d1.getValue());
	}
	System.out.println();
	System.out.println("Get the details of youngest male employee in the product development department?");
	
	Optional<Employee> detailsOfYoungMaleEmpInProductDev=employeeList.stream().filter(e3->e3.getGender()=="Male" && e3.getDepartment()=="Product Development").min(Comparator.comparing(Employee::getAge));
	
	System.out.println();
	System.out.println(detailsOfYoungMaleEmpInProductDev.get());
	Employee youngestMale=employeeList.stream().filter(e1->e1.getDepartment()=="Product Development").sorted(Comparator.comparingInt(Employee::getAge)).findFirst().get();
	System.out.println(youngestMale);
	System.out.println();
	System.out.println("Who has the most working experience in the organization?");
	System.out.println();
	//Optional<Employee> maxExp=employeeList.stream().max(Comparator.comparing(Employee::getYearOfJoining).reversed());

	Optional<Employee> maxExp=employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining));
	System.out.println("max exp ");
	//employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining).reversed()).forEach(System.out::print);
	System.out.println(maxExp);
	System.out.println();
	System.out.println(": How many male and female employees are there in the sales and marketing team?");
	Map<String,Long> countMaleAndFemaleInSales=employeeList.stream().filter(e5->e5.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	
	System.out.println();
	System.out.println(countMaleAndFemaleInSales);
	System.out.println();
	System.out.println("What is the average salary of male and female employees?");
	Map<String,Double> avgSalOfMaleAndFemale=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
	System.out.println();
	System.out.println(avgSalOfMaleAndFemale);
	System.out.println();
	System.out.println("List down the names of all employees in each department?");
	//Employee ez=(Employee) employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	//employeeList.stream().map(Employee::getName).collect(Collectors.groupingBy(Employee::getDepartment));
	Map<String,List<Employee>> namesOfEmpByDept=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	Set<Entry<String,List<Employee>>> ss=namesOfEmpByDept.entrySet();
	for(Map.Entry<String, List<Employee>> s1:ss) {
		System.out.println("--------------------------------------");
		System.out.println("Dept Name :" +s1.getKey());
		System.out.println("--------------------------------------");
		List<Employee> l=s1.getValue();
		for(Employee en:l) {
			System.out.println(en.getName());
		}
	}
	System.out.println();
	
	System.out.println("What is the average salary and total salary of the whole organization?");
	System.out.println();
	Double avgSal=employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	System.out.println(avgSal);
	Double sumSal=employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
	System.out.println(sumSal);
	DoubleSummaryStatistics dss=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	System.out.println(dss.getAverage());
	System.out.println(dss.getSum());
	System.out.println();
	System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years");
	System.out.println();
	employeeList.stream().filter(e6->e6.getAge()<=25).forEach(System.out::println);
	Stream<String> op=employeeList.stream().filter(e6->e6.getAge()<=25).map(Employee::getName);

	//System.out.println(op);
	
	
	/*System.out.println("options(of) and (ofnullbale()");
	System.out.println(Optional.of(employeeList).get());
	System.out.println(Optional.ofNullable(employeeList).get());*/
	System.out.println("find out years of experience ");
	System.out.println();
	employeeList.stream().filter(k->LocalDate.now().getYear()-k.getYearOfJoining()>=10).map(Employee::getName).forEach(System.out::println);
	
	Random r= new Random();
	//r.ints(10,100).limit(7).sorted().forEach(System.out::println);
	//r.ints(10,100).limit(5).max().ifPresent(s->System.out.println(s));
	//r.ints(10,100).limit(2).filter(i->i%2==0).sorted().forEach(System.out::println);
	Function<Integer,Integer> f=i->(i*i); 
	//	f.apply(1);
		//System.out.println(f.apply(2));

		DoubleSummaryStatistics dn=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		//System.out.println(dn.getMax());
	}
}
