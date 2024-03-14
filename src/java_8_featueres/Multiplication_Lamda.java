package java_8_featueres;

@FunctionalInterface
interface Mul{
	int mul(int x,int y);//Definition
}
class MulTest implements Mul{
	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
}

public class Multiplication_Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulTest m= new MulTest();
		m.mul(9,8);// no output
		System.out.println(m.mul(14, 9));

		//using lamda
		
		Mul mul=(x,y)->x*y;//lamda logic
		mul.mul(11, 11);//hash code in output
		System.out.println(mul.mul(11, 9));
		
		
	}

}
