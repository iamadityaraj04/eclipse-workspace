package employee.assignment;

//manager class
final class Manager extends Employee{
	public Manager(){
		super(80000,"MANAGER");
	}
	public void raiseSalary() {
		setSalary(getSalary()+10000);
	}
}