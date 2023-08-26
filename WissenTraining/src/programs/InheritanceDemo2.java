package programs;
class A2{
	
	A2(){
		System.out.println("A2()");
	}
	A2(int x){
		this();
		System.out.println("A2(int)");
	}
}
class B2 extends A2{
	B2(){
		super(11);
		System.out.println("B2()");
	}
	B2(int x){
		this();
		//super();--- this can't happen because super and this both 
		//            should be the first statement of its constructor
		System.out.println("B2(int)");
	}
}
public class InheritanceDemo2 {
	public static void main(String args[]) {
		new B2();
	}
}
