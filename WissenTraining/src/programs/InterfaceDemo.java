package programs;

interface X{
	int a=90;
	void add();
	void sub();
}
interface Y{
	int b=30;
	void mul();
	void div();
}

//inherit properties of X and Y interface (multiple inheritance)
interface Z extends X,Y{
	
}

class Calculator implements Z{
	public void add() {
		System.out.println("Sum: "+ (X.a+Y.b));
	}
	public void sub() {
		System.out.println("Sub: "+ (X.a-Y.b));
	}
	public void mul() {
		System.out.println("Mul: "+ (X.a*Y.b));
	}
	//since z inherit X and Y we can access their variables
	public void div() {
		System.out.println("Div: "+ (Z.a/Z.b));
	}
	
}
public class InterfaceDemo {
	public static void main(String args[]) {
		X x1=new Calculator();
		x1.add();
		x1.sub();
		
		//can not perform these two action because X do not contian method mul() and div()
		//x1.mul();
		//x1.div();
		
		Y y1=new Calculator();
		y1.mul();
		y1.div();
		//can not perform these two action because Y do not contian method add() and sub()
		//y1.add();
		//y1.sub();
		
		//here we can perform all the acitons because Z inherits X and Y
		Z z1=new Calculator();
		z1.add();
		z1.sub();
		z1.mul();
		z1.div();
	}
}
