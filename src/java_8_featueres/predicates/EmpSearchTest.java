package java_8_featueres.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmpSearchTest {

	public static void main(String[] args) {
		
		//create emp object to explore predicates
		
		Employee e1= new Employee("Arjun", 50000, 5);
		Employee e2= new Employee("Praksh",40000, 4);
		Employee e3= new Employee("Rani", 39000, 3);
		Employee e4= new Employee("Rohit", 34000, 7);
		Employee e5= new Employee("Sanjay", 10000, 2);
		
		//using predicates search emp with exp>3 and sal 30000 print there names
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		//predicate condition check
		
		Predicate<Employee> pr=e->(e.esal>30000 && e.experince>3);//condition implementation
		
		//iterate using forEach loop
		
		for(Employee e:al) {
	
			//System.out.println(pr.test(e));//will return only true false values.
			if(e.esal>30000 && e.experince>3)
			//if(pr.test(e)) {
				System.out.println(e.ename+"   "+e.esal);
			}
			
		
		
		
		
		
		
		
		
	}
}
