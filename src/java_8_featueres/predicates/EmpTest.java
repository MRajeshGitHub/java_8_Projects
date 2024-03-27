package java_8_featueres.predicates;

import java.util.function.Predicate;

public class EmpTest {
public static void main(String[] args) {
	
	
	//create emp object to explore predicates
	
	Employee emp= new Employee("Arjun", 50000, 5);
	
	//search the emp with the predicates
	//emp sal>3000 && experice >3
	
	Predicate<Employee> pr= e1->(e1.esal>30000 && e1.experince>3);
	
	System.out.println(pr.test(emp));
	
	
	

	
}
}
