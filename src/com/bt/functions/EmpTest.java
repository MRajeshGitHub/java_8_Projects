package com.bt.functions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpTest {

	public static void main(String[] args) {
		// Employee salary bonus calculation using lamda with function interface
		
		ArrayList<Employee> elist= new ArrayList<Employee>();
		elist.add(new Employee("Ajay", 40000));
		elist.add(new Employee("Vjay", 20000));
		elist.add(new Employee("Sanjay",15000));
		elist.add(new Employee("Arun", 50000));
		
		
		//writng the lamda for bonus of employee salary
		
		Function<Employee, Integer> bonus=e->{
			                                                                
			long sal=e.esal;
			if(sal>10000 && sal<20000)
				return (int) (sal*10/100);
			else if(sal>20000 && sal<30000)
				return (int)(sal*20/100);
			else if(sal>30000 && sal<40000)
				return (int)(sal*30/100);
			else
				return (int)(sal*40/100);		
		};
      
		//predicate use cases
		
		//Predicate<Integer> p=bn->bn>10000;
	
		
		
		//filter the data using forEach loop
		for(Employee emp:elist) {
			long b=bonus.apply(emp);
		
			System.out.println(emp.ename+" "+emp.esal);
			System.out.println("bonus is :"+b);
			
		}

	}

}
