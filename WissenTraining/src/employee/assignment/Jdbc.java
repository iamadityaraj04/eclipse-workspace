package employee.assignment;

import java.sql.*;

public class Jdbc{
	public static void dbConnect() {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			PreparedStatement ps;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
