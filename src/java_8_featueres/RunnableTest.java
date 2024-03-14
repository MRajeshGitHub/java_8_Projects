package java_8_featueres;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
		
	}
	
}
public class RunnableTest {
	public static void main(String[] args) {
		
		/*
		 * Runnable r= new MyRunnable(); Thread t = new Thread(r); t.start(); for(int
		 * i=0;i<10;i++) { System.out.println("Main thread"); }
		 */
	//lamda logic
		
		Runnable rn=()->{
			for(int i=0;i<10;i++) {
				System.out.println("Runnable implementation using lamda");
			}
		};
		
		Thread t= new Thread(rn);
		t.start();
		System.out.println("Main thread");
		
		
		
	
	}
	

}
