package programs;

import java.util.Scanner;
public class KeyInput {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		//String name=sc.next();
		String name=sc.nextLine(); //nextLine() is used to take multiple words
		
		System.out.print("Enter your age: ");
		int age=sc.nextInt();
		
		System.out.print("Enter your monthly income: ");
		float salary=sc.nextFloat();
		
		System.out.print("Are you married: ");
		boolean married=sc.nextBoolean();
		
		System.out.println("========================");
		System.out.print("Name: "+name+"\n"+"Age: "+age+"\n"+"Salary: ₹"+salary+"\n"+"Married: "+married+"\n");
		System.out.println("========================");
		sc.close();
	}
}
