package programs;
class A{
	public static void abc() {
		System.out.println("Hello");
	}
}
class B extends A{
	public static void abc() {
		System.out.println("Hi!");
	}
}
class C extends B{
//	public static void abc() {
//		System.out.println("Thanks");
//	}
}
public class Overriding {
	public static void main(String args[]) {
		A a1=new A();
		a1.abc();
		
		B b1=new B();
		b1.abc();
		
		C c1=new C();
		c1.abc();
		
	}
}
