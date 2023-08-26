package programs;

import java.io.*;
import java.sql.*;
import java.util.*;

class Menu{
	public int menu() throws Exception
	{
		System.out.println("------------------");
		System.out.println("1. Add");
		System.out.println("2. Search");
		System.out.println("3. Result");
		System.out.println("4. Exit");
		System.out.println("------------------");
		System.out.print("Enter you choice: ");
		return new Scanner(System.in).nextInt();
	}
}

class InvalidInput extends Exception{
	public static int menuChoice() {

		Menu m=new Menu();
		while(true) {
			try
			{
				int ch=m.menu();
				if(ch<1 || ch>4) {
					throw new InvalidInput();
				}
				return ch;
			}
			catch (InvalidInput e) 
			{
				System.out.println("Invalid Input! Please Enter a valid choice.");
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Invalid Input! Please Enter a valid choice.");
			}
			catch(Exception e)
			{
				System.out.println("Unknown Exception");
			}
		}
	}
}
public class Test {
	static Connection connect;
	static PreparedStatement ps;
	static Statement st;
	static {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		int ch1,ch2;
		do {
			ch1=InvalidInput.menuChoice();
			if(ch1==1) {
				try {
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					System.out.print("enter reg no. : ");
					int regNo=Integer.parseInt(br.readLine());
					System.out.print("enter name : ");
					String name=br.readLine();
					System.out.print("enter age : ");
					int age=Integer.parseInt(br.readLine());
					System.out.print("enter standard : ");
					int standard;
					boolean checkStandard=true;
					do {
						standard=Integer.parseInt(br.readLine());
						if(standard<1 || standard >10) {
							System.out.println("please enter valid standard between 1-10");
						}
						else {
							checkStandard=false;
						}
					}while(checkStandard);
					
					System.out.print("enter school name : ");
					String schoolName=br.readLine();
			
					ps=connect.prepareStatement("insert into student values(?,?,?,?,?)");
					ps.setInt(1, regNo);
					ps.setString(2, name);
					ps.setInt(3, age);
					ps.setInt(4, standard);
					ps.setString (5, schoolName);
					
					ps.execute();
				}
				catch(Exception e){
					System.out.print(e);
				}
			}
			else if(ch1==2) {
				System.out.println("------------------");
				System.out.println("1. by registration");
				System.out.println("2. all sutdent");
				System.out.println("------------------");
				System.out.print("Enter you choice: ");
				ch2=new Scanner(System.in).nextInt();
				
				if(ch2==1) {
					System.out.print("Enter registration number: ");
					int regNo=new Scanner(System.in).nextInt();
					try {
						st=connect.createStatement();
						
						ResultSet rs=st.executeQuery("select * from student where regNo="+regNo);
						while(rs.next()) {
							System.out.println("Name: "+rs.getString(2));
							System.out.println("Age: "+rs.getString(3));
							System.out.println("Standard: "+rs.getString(4));
							System.out.println("School Name: "+rs.getString(5));
						}
						rs.close();
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
				if(ch2==2) {
					try {
						st=connect.createStatement();
						ResultSet rs=st.executeQuery("select * from student");
						while(rs.next()) {
							System.out.println("Name: "+rs.getString(2));
							System.out.println("Age: "+rs.getString(3));
							System.out.println("Standard: "+rs.getString(4));
							System.out.println("School Name: "+rs.getString(5));
						}
						rs.close();
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
			}
			else if(ch1==3) { 
				try {
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					System.out.print("English : ");
					int englishMarks=Integer.parseInt(br.readLine());
					System.out.print("Hindi : ");
					int hindiMarks=Integer.parseInt(br.readLine());
					System.out.print("Math : ");
					int mathMarks=Integer.parseInt(br.readLine());
					System.out.print("Science : ");
					int scienceMarks=Integer.parseInt(br.readLine());
					System.out.print("Social : ");
					int socialMarks=Integer.parseInt(br.readLine());
			
					ps=connect.prepareStatement("insert into result values(?,?,?,?,?)");
					ps.setInt(1, englishMarks);
					ps.setInt(2, hindiMarks);
					ps.setInt(3, mathMarks);
					ps.setInt(4, scienceMarks);
					ps.setInt(5, socialMarks);
					
					ps.execute();
				}
				catch(Exception e){
					System.out.print(e);
				}
			}
			else {
				System.exit(0);
			}
		}while(ch1!=4);
	}
}
