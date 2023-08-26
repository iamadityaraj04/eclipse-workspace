package programs;

import java.sql.*;
public class Jdbc6 {
	public static void main (String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			
			//Statement st=con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)//by default;
			//above statement is equivalent to the below one
			//Statement st=con.createStatement();
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=st.executeQuery("select * from emp;");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+"\n");	
			}
			System.out.println("=======================");
			
			while(rs.previous()) {
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+"\n");	
			}
			System.out.println("=======================");
			
			rs.first();
			{
				System.out.println("First Data: "+rs.getString(1)+" | "+rs.getString(2)+"\n");	
			}
			System.out.println("=======================");
			
			rs.last(); 
			{
				System.out.println("Last Data: "+rs.getString(1)+" | "+rs.getString(2)+"\n");	
			}
			System.out.println("=======================");
			
			//jump to 5th position
			rs.absolute(5);
			{
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+"\n");	
			}
			System.out.println("=======================");
			
			//moving forward from present pointer
			rs.relative(2);
			{
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+"\n");	
			}
			System.out.println("=======================");
			
			//moving backward from present pointer
			rs.relative(-2);
			{
				System.out.println(rs.getString(1)+" | "+rs.getString(2)+"\n");	
			}
			System.out.println("=======================");
			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}