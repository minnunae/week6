package TestPackage;
import package1.A;
import package1.B;
public class TestPackage {
	static String message = "Hello World!";
	static String name = "Mark Sakaberg";
	static String eat = "Brteakfast";
	String company = "Facbook coperation";
	
		public TestPackage() {
			System.out.println(company + "12");
		}
	
		public static void main (String[]args) {
			Welcome(message);
			Name(name);
			eat(eat);
			TestPackage objT = new TestPackage();
			A objA2 = new A();
			B objB2 = new B();
		}
		
		public static void Welcome(String m) {
			String text ="Hi :";
			System.out.print(text + "" + m);
		}
		public static void Name(String n) {
        	int age = 32;
			System.out.print("Name is :" + n + "Age id :" + age);
		}
		public static void eat(String e) {
			System.out.print("Food is :" + e);
		}
}
