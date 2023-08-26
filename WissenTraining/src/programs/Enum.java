package programs;

enum Gender{
	Male,Female
}
class Per{
	String name;
	int age;
	Gender gender;
	public Per(String name, int age, Gender gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
}
public class Enum {
	public static void main (String[] args) {
		Per p1=new Per("Aditya",24,Gender.Male);
		p1.display();
	}
	
}
