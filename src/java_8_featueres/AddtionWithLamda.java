package java_8_featueres;

@FunctionalInterface
interface Add{
	int add(int x,int y);
}
public class AddtionWithLamda {

	public static void main(String[] args) {
		
		Add a=(x,y)->x+y;
		System.out.println("Addtion using lamda :"+a.add(11, 78));
	}
}
