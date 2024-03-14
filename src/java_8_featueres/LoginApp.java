package java_8_featueres;

@FunctionalInterface
interface Service{
	String login(String uname,String upass);
}

public class LoginApp {

	public static void main(String[] args) {
		
		Service s=(uname,upass)->{return uname.equalsIgnoreCase("rajesh")&& upass.equals("Rajesh@gmail.com")?"login":"login fail";};
		s.login("Rajesh","Rajesh@gmail.com");
		System.out.println("your login status is :"+s.login("rajesh", "Rajesh@gmail.com"));
		System.out.println();
	}
}
