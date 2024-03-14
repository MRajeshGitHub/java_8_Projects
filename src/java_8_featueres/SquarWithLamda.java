package java_8_featueres;

@FunctionalInterface
interface Squar{
	int squar(int x);//method def
}

class SqrTest implements Squar{
	@Override
	public int squar(int x) {
		// TODO Auto-generated method stub
		return x*x;
	}
}


public class SquarWithLamda {

	public static void main(String[] args) {
		SqrTest s= new SqrTest();
		s.squar(11);
		System.out.println(s);//will give hash code data
		System.out.println(s.squar(8));//actual data will show
		
		//implemnts using Lamda
		
		Squar sr=(x)->x*x;//lamda implementation of logics
		sr.squar(11);//no output in this way
		System.out.println(sr.squar(14));
		
		
		
		
		
	}
}
