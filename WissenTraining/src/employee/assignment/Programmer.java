package employee.assignment;

//programmer class
final class Programmer extends Employee{
	public Programmer(){
		super(25000,"PROGRAMMER");
	}
	public void raiseSalary() {
		setSalary(getSalary()+5000);
	}
}
