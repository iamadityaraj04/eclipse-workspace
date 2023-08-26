package programs;

import java.sql.*;
import java.util.*;
public class Jdbc5 {
	public static void main (String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			Statement st=con.createStatement();
			st.addBatch("insert into emp values('Venkata', 31);");
			st.addBatch("insert into emp values('Sunil', 39);");
			st.addBatch("insert into emp values('Reddy', 48);");
			st.addBatch("insert into emp values('Shruti', 28);");
			st.addBatch("insert into emp values('Akansha', 37);");
			st.addBatch("insert into emp values('Vikram', 41);");
			
			System.out.println("Do you want to execute batch? (y/n)");
			String confirm=new Scanner(System.in).nextLine();
			
			if(confirm.equals("y"))
			{
				st.executeBatch();
				System.out.println("All of the queries has been executed.");
			}
			else
			{
				System.out.println("None of the query executed....");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
