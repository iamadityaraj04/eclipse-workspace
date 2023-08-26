package _12Jan;

import java.util.Scanner;
import java.util.ArrayList;

class Employee{
	private String name;
	private int age;
	private String designation;
	private float salary;
	
//	ArrayList<Employee> list=new ArrayList<>(0);
	
//	Employee(){
//		this.menu();
//	}
	
//	public void menu() {
//		System.out.println("------------------");
//		System.out.println("1. Create");
//		System.out.println("2. Display");
//		System.out.println("3. Raise Salary");
//		System.out.println("4. Exit");
//		System.out.println("------------------");
//		System.out.print("Enter you choice: ");
//		Scanner sc=new Scanner(System.in);
//		int choice=sc.nextInt();
//		
//		
//		
//		if(choice==1) {
//			this.subMenu();
//		}
//		else if(choice==2) {
//			if(list.size()<1) {
//				System.out.println();
//				System.out.println("------------------");
//				System.out.println("No records found!");
//				System.out.println("------------------");
//				System.out.println();
//				menu();
//			}else {
//				for(int i=0;i<list.size();i++) {
//					list.get(i).display();
//				}
//				menu();
//			}
//		}
//		else if(choice==3) {
//			for(int i=0;i<list.size();i++) {
//				list.get(i).raiseSalary();
//			}
//			System.out.println();
//			System.out.println("Salary Updated Successfully!");
//			System.out.println();
//			menu();
//		}
//		else{
//			System.exit(0);
//		}
//	}
//	public void subMenu() {
//		System.out.println();
//		System.out.println("------------------");
//		System.out.println("1. Clerk");
//		System.out.println("2. Programmer");
//		System.out.println("3. Manager");
//		System.out.println("4. Exit");
//		System.out.println("------------------");
//		System.out.print("Enter you choice: ");
//		Scanner sc=new Scanner(System.in);
//		int choice=sc.nextInt();
//		
//		if(choice==1) {
//			list.add(new Clerk());
//			subMenu();
//		}
//		else if(choice==2) {
//			list.add(new Programmer());
//			subMenu();
//		}
//		else if(choice==3) {
//			list.add(new Manager());
//			subMenu();
//		}
//		else {
//			menu();
//		}
//		
//	}

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

//main method
public class EmployeeMain {
	public static void main(String args[]){
//		new Employee();
		int ch1,ch2,count=0;
		Employee[] e=new Employee[1000];
		
		do {
			System.out.println("------------------");
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Raise Salary");
			System.out.println("4. Exit");
			System.out.println("------------------");
			System.out.print("Enter you choice: ");
			Scanner sc=new Scanner(System.in);
			ch1=sc.nextInt();
			
			if(ch1==1) {
				do {
					System.out.println();
					System.out.println("------------------");
					System.out.println("1. Clerk");
					System.out.println("2. Programmer");
					System.out.println("3. Manager");
					System.out.println("4. Exit");
					System.out.println("------------------");
					System.out.print("Enter you choice: ");
				
					ch2=new Scanner(System.in).nextInt();
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
					default: 
						System.out.println();
						System.out.println("Not a valid choice!");
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
			else {
				System.out.println();
				System.out.println("Not a valid choice!");
			}
		}while(ch1!=4);
	}
}

