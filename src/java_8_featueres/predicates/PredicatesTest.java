package java_8_featueres.predicates;

import java.util.function.Predicate;

public class PredicatesTest {

	//without lamda
	
	public boolean test(int x) {
		if(x>10)
			return true;
		else
			return false;
	}
	
}

class M{
	public static void main(String[] args) {
		
		PredicatesTest p= new PredicatesTest();
		p.test(11);//no output
		System.out.println(p.test(4));
		
		//using predicates
		
		System.out.println("using predicates");
		System.out.println("===============");
		Predicate<Integer> p1=(i)->i>20;
		System.out.println(p1.test(11));
		
		
		
		
		
		
	}
}
