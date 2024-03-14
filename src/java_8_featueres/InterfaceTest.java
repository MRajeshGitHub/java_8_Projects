package java_8_featueres;

@FunctionalInterface
interface Vichel{
	//method definition
	void startVichel();//with no body
	//void car();
	default void add() {
		System.out.println("default method inside the interface");
	}
	static void sim() {
		System.out.println("static method inside interface....");
	}
}
public class InterfaceTest  implements Vichel{

	@Override
	public void startVichel() {
		// Override all method of interface
		
		System.out.println("Interface method implemented");
		
	}

}
class Tess{
	public static void main(String[] args) {
		Vichel v= new InterfaceTest();//object casting parent can hold child object
		v.startVichel();
		v.add();
		Vichel.sim();
		
		//lamda code for the given interface
		
		Vichel v1=()->System.out.println("Interface Implementation with lamda expression...");
		System.out.println("Interface Implementation with lamda expression...");
		System.out.println("Interface Implementation with lamda expression...");
		System.out.println("Interface Implementation with lamda expression...");
		v1.startVichel();
		
		
		
		
		
		
		
		
		
	}
}