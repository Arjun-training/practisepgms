package abc;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HighestMark {

	public static void main(String[] args) {
		/*
		l.stream().collect(Collectors.groupingBy(Student::getGender),Collectors.maxBy(Comparator))
		l.stream().filter(e->e.getGender=="Male").map(Student::getMarks).sorted(Comparator.reverseOrder()).findFirst().get();
		l.stream().filter(e->e.getGender=="Male").map(Student::getMarks).sorted(Comparator.ComparingInt(Student::getMarks).reverse()).findFirst().get();
		*/
		
		String str="Welcome to India";

		String[] s=str.split(" ");

		String swap="";

		for(int i=s.length-1;i>=0;i--){

		swap+=s[i]+" ";

		}
		
		System.out.println(swap);
		
		List<String> ls=Arrays.stream(str.split(" ")).collect(Collectors.toList());
		//ls.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new))
		List<String> llist = Arrays.asList("Apple","Orange");
		llist.stream().filter(e->!e.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		
		/*List<Employee> empId, deptList
		List<Dept>  deptId,depName,seqno
		 
		1 , <2,3,4>
		2,  <2,5,6>
		 
		2, dtwo,0
		3, dthree,1
		 
		 
		"empList":[
		{
		"empId":1,
		"dept": [
			{ "deptId":2,
			  "seqno":1
			},
			{ "deptId":3,
			  "seqno":2
			},
			{ "deptId":4,
			  "seqno":3
			}
			]
		},
		{
		"empId":2,
		"dept": [
			{ "deptId":2,
			  "seqno":1
			},
			{ "deptId":5,
			  "seqno":2
			},
			{ "deptId":6,
			  "seqno":3
			}
			]
		}
		]*/
	}
}
