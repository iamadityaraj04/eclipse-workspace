package programs;

interface TestStaticInterface{
	static int sum(int num1, int num2) {
		return num1+num2;
	}
}

public class StaticInterface implements TestStaticInterface {
	public static void main(String[] args) {
		System.out.println("Sum: "+TestStaticInterface.sum(122,343));
	}
	
}
