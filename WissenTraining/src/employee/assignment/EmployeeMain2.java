package employee.assignment;

import java.util.*;

import programs.Person;

import java.io.*;

public class EmployeeMain2{
	public static void main(String args[]) {
		int ch1,ch2,ch3;
		
		ArrayList<Employee> emp=Employee.readFromFile();
		Iterator<Employee> it;
		try 
		{
			File dir=new File("emp");
			dir.mkdir();
			File f=new File(dir,"employee.ser");
			f.createNewFile();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		do {
			ch1=InvalidInputException.menuChoice();
			if(ch1==1) {
				do {
					ch2=InvalidInputException.subMenuChoice();
					switch(ch2) {
					case 1:
						emp.add(new Clerk());
						break;
					case 2: 
						emp.add(new Programmer());
						break;
					case 3:
						emp.add(new Manager());
						break;
					}	
				}while(ch2!=4);
				
			}
			else if(ch1==2){
					//sorting and displaying data
					do {
						ch3=InvalidInputException.displayMenuChoice();
						switch(ch3) {
						case 1:
							Collections.sort(emp,new AgeSorter());
							break;
						case 2: 
							Collections.sort(emp,new DesignationSorter());
							break;
						case 3: 
							Collections.sort(emp,new NameSorter());
							break;
						case 4: 
							Collections.sort(emp,new SalarySorter());
							break;
						}
						it=emp.iterator();
						while(it.hasNext()) {
							System.out.println(it.next());
						}
						
					}while(ch3!=5);
			}

				//deserialization
				/*try
				{
					ObjectInputStream ois=new ObjectInputStream(new FileInputStream("emp/employee.ser"));
					emp=(ArrayList)ois.readObject();
					ois.close();
					for (Employee employee : emp) {
						System.out.println(employee.getName()+" | "+employee.getAge()+" | "+employee.getSalary()+" | "+employee.getDesignation());
					}
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}*/
				//Employee.readFromFile();
			else if(ch1==3) {
				if(emp.size()==0) {
					System.out.println("\nNo records to raise salary.\n");
				}
				else
				{
					it=emp.iterator();   
					while(it.hasNext()) {
						((Employee)it.next()).raiseSalary();
					}
					System.out.println();
					System.out.println("Salary Updated Successfully!");
					System.out.println();
				}
				
			}
		}while(ch1!=4);
		Employee.writeToFile(emp);
		System.out.println("Number of Employees created: "+emp.size());
	}
}
