package java_8_featueres.predicates;

import java.util.function.Predicate;

public class NameSearch {

	
	public static void main(String[] args) {
		
		String [] names= {"Anushka","Anjali","Kajol","Rani","Dipika"};//names array
		
		Predicate<String> p=(n)->n.charAt(0)=='k';
		
		for(String n:names) {
			if(p.test(n))
				System.out.println(n);
		}
		
	                               
}
}