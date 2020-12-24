package package1;

public class A {
	String messageA = "Class A";
	public A() {
		System.out.println("Class A");
	}
	public static void main(String[]args) {
		A objA = new A();
		B objB = new B();
	}
}
