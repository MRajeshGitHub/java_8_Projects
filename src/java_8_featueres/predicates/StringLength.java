package java_8_featueres.predicates;

import java.util.function.Predicate;

public class StringLength {

	public static void main(String[] args) {
		// Write the predicate to check the length of given string is greater than 3 or not
		
		//predicate logic for length
		
		Predicate<String> p=s->s.length()>5;
		System.out.println(p.test("Rajesh"));
		System.out.println(p.test("sam"));
		System.out.println(p.test("Ajay"));
		
		String [] names= {"Anushka","Anjali","Kajol","Rani","Dipika"};
		
		for(String name:names) {
			//if(p.test(name))
			//	System.out.println(name);
		if(name.length()>6)
			System.out.println(name);
		
	
	}
	}

}
