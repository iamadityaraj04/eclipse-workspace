package employee.assignment;

import java.util.*;

public class Menu {
	//menu method
		public int menu() throws InputMismatchException
		{
			System.out.println("------------------");
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Raise Salary");
			System.out.println("4. Remove");
			System.out.println("5. Exit");
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
		
		//displayMenu method
		public int displayMenu() throws InputMismatchException 
		{
			System.out.println();	
			System.out.println("------------------");
			System.out.println("Sort by: ");
			System.out.println("1. Age");
			System.out.println("2. Designation");
			System.out.println("3. Name");
			System.out.println("4. Salary");
			System.out.println("5. Exit");
			System.out.println("------------------");
			System.out.print("Enter you choice: ");
			return new Scanner(System.in).nextInt();
		}
}
