package employee.assignment;

import java.sql.*;
import java.io.*;

public class EmployeeMainJdbc {
	public static void main(String args[]) {
		int ch1,ch2;
		
		do {
			ch1=InvalidInputException.menuChoice();
			if(ch1==1){
				do {
					ch2=InvalidInputException.subMenuChoice();
					switch(ch2) {
					case 1:
						new Clerk();
						break;
					case 2: 
						new Programmer();
						break;
					case 3:
						new Manager();
						break;
					}	
				}while(ch2!=4);
			}
			
			else if(ch1==2){
				//display	
				try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root1234");
		            Statement stmt = connection.createStatement();
		            ResultSet resultSet = stmt.executeQuery("select * from EMPDATA");
		            
		            while (resultSet.next()) {
		            	System.out.println(resultSet.getInt(1)+" | "+resultSet.getString(2)+" | "+resultSet.getInt(3)+" | "+resultSet.getDouble(4)+" | "+resultSet.getString(5));
		            }
		            connection.close();
		        } catch (Exception e) {
		            System.out.println(e);
		        }	
			}
			
			else if(ch1==3){ 
				//raiseSalary
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
					Statement st=connect.createStatement();
					st.executeUpdate("update EMPDATA set SALARY=SALARY+2000 where DESIGNATION='CLERK';");
					st.executeUpdate("update EMPDATA set SALARY=SALARY+5000 where DESIGNATION='PROGRAMMER';");
					st.executeUpdate("update EMPDATA set SALARY=SALARY+10000 where DESIGNATION='MANAGER';");
					st.close();
					connect.close();
				}
				catch(Exception ex){
					System.out.println(ex);
				}
				System.out.println();
				System.out.println("Salary Updated Successfully!");
				System.out.println();
			}
			
			else if(ch1==4){
				//remove
				System.out.println("Enter employee id: ");
				try
				{
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					int id=Integer.parseInt(br.readLine());
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
					PreparedStatement ps=connect.prepareStatement("delete from EMPDATA where EMP_ID=?");
					ps.setInt(1, id);
					ps.execute();
					ps.close();
					connect.close();
					
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
			else {
				System.out.println();
				System.out.println("Number of Employees created: "+Employee.count);
				System.exit(0);
			}
		}while(ch1!=5);
	}
}
