package java_8_featueres.predicates;

import java.util.function.Predicate;

public class PredicatesJoinTest {

	public static void main(String[] args) {
		
		//joining predicates using and, or and negate
		//p1->check no. is even
		//p2-> check no is greter then 50
		
		
		int a []= {10,36,48,3,25,66,7,48,69,24,15,55,35,14};
		
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=j->j>50;
		
		//joing p1 and p2 predicates
		//using of and or &&
		for(Integer i:a) {
			
			//use of OR
			if(p2.test(i) || (p1).test(i))
				
				if(p1.negate().test(i))
				
				//use of negate
				
				
			//if(p1.and(p2).test(i))
			//if(p1.test(i) && p2.test(i))
				System.out.println("Enven values and gretaer than 50     :"+i);
		}
	}
}
