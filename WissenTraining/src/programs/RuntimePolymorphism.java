package programs;
class A1{
	public void abc() {
		System.out.println("Hi!");
	}
}
class B1 extends A1{
	public void abc() {
		System.out.println("Hello!");
	}
}
class C1 extends B1{
	public void abc() {
		System.out.println("Thanks!");
	}
}
public class RuntimePolymorphism {
	public static void main(String args[]) {
		//since object is created at runtime and decide function of which class should be called tha's why 
		// it is known as runtime polymorphism
		A1 a1=new A1();
		a1.abc();
		
		a1=new B1();
		a1.abc();
		
		a1=new C1();
		a1.abc();
	}
}
