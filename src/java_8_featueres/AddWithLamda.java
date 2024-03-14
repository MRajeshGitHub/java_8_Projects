package java_8_featueres;

@FunctionalInterface
interface interf{
	int add(int x,int y);//method definition
}

class Test implements interf{
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
		
	}
}

public class AddWithLamda {

	public static void main(String[] args) {
		
		Test t= new Test();//object of implemented class
		t.add(11, 12);
		System.out.println(t.add(11, 78));
	
		
		//using lamda
		
	interf i=(x,y)->(x+y);
	i.add(11, 07);
	System.out.println(i.add(77, 58));
		
		
		
		
		
	}
}
