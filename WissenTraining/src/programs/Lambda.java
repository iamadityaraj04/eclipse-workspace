package programs;


interface Display{
	public void displayData();
}

public class Lambda {
	public static void main(String[] args) {
		
//Lambda Expression
		
		//without lambda function
		String name="Aditya Raj";
		
		int  age=21;
		
		Display d1=new Display() {
			public void displayData() {
				System.out.println("Name: "+name);
			}
		};
		
		d1.displayData();
		
		//with lambda function
		Display d2=()->System.out.println("Age"+age);
		d2.displayData();
		
		
		
	}
	
}
