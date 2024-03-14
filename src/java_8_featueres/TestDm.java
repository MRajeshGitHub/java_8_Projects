package java_8_featueres;

interface Dm{
	void check(int x);
}
public class TestDm {

	public static void main(String[] args) {
		
		Dm d=(x)->System.out.println(x);
		d.check(22);
		
	}
}
