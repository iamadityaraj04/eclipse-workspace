package _13Jan;

import java.util.*;
import java.io.*;  
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
		
		age=InvalidInputException.readAge();

//		while(true) {
//			try
//			{
//				System.out.print("Enter your age: ");
//				age=Integer.parseInt(sc.nextLine());
//				
//				if(age<21 || age >60) {
//					throw new AgeException("Age is less than 21 or greater than 60");
//				}
//				break;
//			}
//			catch(AgeException ex)
//			{
//				//System.out.println(ex.getMessage());
//				System.out.println("Invalid age! Enter age between 21 to 60.");
//			}
//			catch(Exception ex)
//			{
//				System.out.println("Invalid age! Age can only be number.");
//			}
//		}
		
		this.salary=salary;
		this.designation=designation;
	}
	
	//method to display information
	void display() {
		System.out.println();
		System.out.print("Name: "+name+"\n"+"Age: "+age+"\n"+"Designation: "+designation+"\n"+"Salary: ₹"+salary+"\n");
		System.out.println();
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
	void raiseSalary() {
		setSalary(getSalary()+2000);
	}
	
}

//clerk class
class Clerk extends Employee{
	
	public Clerk(){
		super(10000,"CLERK");
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

//menu class
class Menu{
	
	//menu method
	public int menu() throws InputMismatchException
	{
		System.out.println("------------------");
		System.out.println("1. Create");
		System.out.println("2. Display");
		System.out.println("3. Raise Salary");
		System.out.println("4. Exit");
		System.out.println("------------------");
		System.out.print("Enter you choice: ");
		return new Scanner(System.in).nextInt();
		
	}
	//subMenu method
	public int subMenu() throws InputMismatchException 
	{
		System.out.println();	
		System.out.println("------------------");
		System.out.println("1. Clerk");
		System.out.println("2. Programmer");
		System.out.println("3. Manager");
		System.out.println("4. Exit");
		System.out.println("------------------");
		System.out.print("Enter you choice: ");
		return new Scanner(System.in).nextInt();
	}
}
//class AgeException extends Exception  //RuntimeException
//{
//	public AgeException() {
//		super();
//	}
//	public AgeException(String msg) {
//		super(msg);
//	}
//}
class InvalidInputException extends Exception{
	public InvalidInputException() {
		
	}
	public InvalidInputException(String msg) {
		super(msg);
	}
	public static int readAge() {
		while(true) {
			try
			{
				System.out.println("Enter Age: ");
				int age=new Scanner(System.in).nextInt();
				
				if(age<21 || age>60) {
					throw new InvalidInputException();
				}
				else
				{
					return age;
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("Invalid age! Age can only be number.");
			}
			catch(InvalidInputException ex)
			{
				System.out.println("Please enter age between 21 - 60");
			}
		}
	}
}
//main method
public class EmployeeMain {
	public static void main(String args[])
	{

		int ch1,ch2,count=0;
		Employee[] e=new Employee[1000];
		Scanner sc=new Scanner(System.in);
		Menu m=new Menu();
		
		do {
			while(true) {
				try
				{
					ch1=m.menu();
					break;
				}
				catch (InputMismatchException ex) 
				{
					System.out.println("Invalid Input! Please Enter a valid choice.");
				}
				catch(Exception ex)
				{
					System.out.println("Invalid Input! Please Enter a valid choice.");
				}
			}
			if(ch1==1) {
				do {
					while(true) {
						try 
						{
							ch2=m.subMenu();
							break;
						}
						catch (InputMismatchException ex) 
						{
							System.out.println("Invalid Input! Please Enter a valid choice.");
						}
						catch(Exception ex)
						{
							System.out.println("Invalid Input! Please Enter a valid choice.");
						}
					}
					switch(ch2) {
					case 1:
						e[count++]=new Clerk();
						break;
					case 2: 
						e[count++]=new Programmer();
						break;
					case 3:
						e[count++]=new Manager();
						break;
					}	
				}while(ch2!=4);
			}
			else if(ch1==2) {
				if(count==0) {
					System.out.println();
					System.out.println("------------------");
					System.out.println("No records found!");
					System.out.println("------------------");
					System.out.println();
				}
				else {
					for(int i=0;i<count;i++) {
						e[i].display();
					}
				}
			}
			else if(ch1==3) {
				for(int i=0;i<count;i++) {
					e[i].raiseSalary();
				}
				System.out.println();
				System.out.println("Salary Updated Successfully!");
				System.out.println();
			}
			else if(ch1==4) {
				System.exit(0);
			}
			else {
				System.out.println();
				System.out.println("Please enter a valid choice.");
				System.out.println();
			}
			
		}while(ch1!=4);
	}
}