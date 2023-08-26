package assignment;

class Employee{
	String name;
	int age;
	float salary;
	String designation;
	
	Employee(String name, int age, float salary, String designation){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.designation=designation;
	}
	void raiseSalary(float amount) {
		salary+=amount;
	}
	void display(){
		System.out.println("------------------");
		System.out.println(" Employee Details ");
		System.out.println("------------------");
		System.out.print("Name: "+name+"\n"+"Age: "+age+"\n"+"Salary: ₹"+salary+"\n"+"Designation: "+designation+"\n");
	}
}

public class EmployeeMain {
	public static void main(String args[]) {
		Employee emp1=new Employee("Aditya Raj",21,25000,"Developer");
		Employee emp2=new Employee("Shubham Kumar",25,75000,"Assistant Manager");
		emp2.raiseSalary(-9000);
		emp1.raiseSalary(9000);
		emp1.display();
		emp2.display();
	}
}

