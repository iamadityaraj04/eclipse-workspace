package _11Jan;

import java.util.Scanner;

class Employee{
	
	private String name;
	private int age;
	private String designation;
	private float salary;
	//constructor
	Employee(){
		this.enterDetails();
	}
	
	//method to save employee details
	public void enterDetails() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter employee name: ");
		name=sc.nextLine();
		
		System.out.print("Enter employee age: ");
		age=Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter employee designation: ");
		designation=sc.nextLine();
		
		System.out.print("Enter emplyee monthly income: ");
		salary=sc.nextFloat();
	}
	
	//method to update employee salary
	public void raiseSalary() {
		
		System.out.print("Enter amount to update salary of "+name+": ");
		salary+=new Scanner(System.in).nextFloat();
		
	}
	
	//method to display employee details
	public void display() {
		System.out.println("------------------");
		System.out.println(" Employee Details ");
		System.out.println("------------------");
		System.out.print("Name: "+name+"\n"+"Age: "+age+"\n"+"Designation: "+designation+"\n"+"Salary: ₹"+salary+"\n");
	}
}


public class EmployeeMain2 {
	//main method
	public static void main(String args[]) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.display();
		emp2.display();
		
		emp1.raiseSalary();
		emp2.raiseSalary();
		
		emp1.display();
		emp2.display();
	}
}
