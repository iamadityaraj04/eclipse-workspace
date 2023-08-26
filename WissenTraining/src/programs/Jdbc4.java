package programs;

import java.sql.*;
public class Jdbc4 {
	public static void main (String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			// a procedure (my_procedure) is already create in db
			CallableStatement cs=con.prepareCall("CALL my_procedure()");
			cs.execute();
			System.out.println("Procedure has been called suceessfully...");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
