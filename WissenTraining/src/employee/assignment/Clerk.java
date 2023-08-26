package employee.assignment;

//clerk class
final class Clerk extends Employee{
	
	public Clerk(){
		super(10000,"CLERK");
	}
	public void raiseSalary() {
		setSalary(getSalary()+2000);
	}
}