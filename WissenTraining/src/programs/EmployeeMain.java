package programs;
import java.util.Scanner;


class Employee{
	private String name;
	private int age;
	private String designation;
	private float salary;
	
	//constructor to get details
	public Employee(float salary, String designation) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name: ");
		name=sc.nextLine();
		
		System.out.print("Enter your age: ");
		age=Integer.parseInt(sc.nextLine());
		this.salary=salary;
		this.designation=designation;
	}
	
	//method to display information
	void display() {
		System.out.println("------------------");
		System.out.println(" Employee Details ");
		System.out.println("------------------");
		System.out.print("Name: "+name+"\n"+"Age: "+age+"\n"+"Designation: "+designation+"\n"+"Salary: ₹"+salary+"\n");
	}
	
	//method to get and set salary
	float getSalary() {
		return salary;
	}
	void setSalary(float salary) {
		if(salary>=0) {
			this.salary=salary;
		}	
	}
	
}

//clerk class
class Clerk extends Employee{
	
	public Clerk(){
		super(10000,"CLERK");
	}
	void raiseSalary() {
		setSalary(getSalary()+2000);
	}
	
}

//programmer class
class Programmer extends Employee{
	public Programmer(){
		super(25000,"PROGRAMMER");
	}
	void raiseSalary() {
		setSalary(getSalary()+5000);
	}
}

//manager class
class Manager extends Employee{
	public Manager(){
		super(80000,"MANAGER");
	}
	void raiseSalary() {
		setSalary(getSalary()+10000);
	}
}

//main method
public class EmployeeMain {
	public static void main(String args[]){
		Clerk c1=new Clerk();
		Programmer p1=new Programmer();
		Manager m1=new Manager();
		c1.display();
		p1.display();
		m1.display();
		
		c1.raiseSalary();
		p1.raiseSalary();
		m1.raiseSalary();
		
		c1.display();
		p1.display();
		m1.display();
	}
}
