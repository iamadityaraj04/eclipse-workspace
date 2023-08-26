package programs;
class First{
	int x=10;
	public void abc() {
		System.out.println("Hi!");
	}
}
class Sec extends First{
	public void abc() {
		System.out.println("Hello!");
	}
	public void xyz() {
		System.out.println(super.x);
		System.out.println(x);
		super.abc();
		abc();
	}
}
public class InheritanceDemo1 {
	public static void main(String args[]) {
		Sec b1=new Sec();
		b1.xyz();
	}
}
