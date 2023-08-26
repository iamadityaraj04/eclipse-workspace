package programs;

class AA{
	static int x;
	public static void abc() {
		System.out.println("Hello");
	}
	static class B{
		
	}
}

public class StaticDemo {
	static int a=100;
	public static void main(String args[]) {
		AA a1=new AA();
		AA a2=new AA();
		AA a3=new AA();
		a1.x=10;
		a2.x=20;
		a3.x=30;
		a3.x=50;
		System.out.println(a1.x);
		System.out.println(a2.x);
		System.out.println(a3.x);
		AA.abc();
	}
	static {
		System.out.println("From static block: "+a);
	}
}
