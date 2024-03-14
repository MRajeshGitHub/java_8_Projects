package java_8_featueres;

@FunctionalInterface
interface Hello{
	void hello();
	
}
public class HelloLamda {

	public static void main(String[] args) {
		
		Hello h=()->System.out.println("Hellow Lamda");
		h.hello();
		System.out.println("-----------------------");
		Hello h1=()->System.out.println("Hellow lamda");
		System.out.println("Hellow lamda");
		System.out.println("Hellow lamda");
		h1.hello();
		System.out.println("----------------------------");
		
	}
}
