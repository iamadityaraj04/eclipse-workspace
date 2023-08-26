package programs;

import java.sql.*;
import java.io.*;

public class TransactionDemo {
	public static void main (String[] args)
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			
			//by default it is true
			con.setAutoCommit(false);
			
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?);");
			
			for(int i=1;i<=5;i++) {
				System.out.print ("Enter name : ");
				String name=br.readLine();
				System.out.print ("Enter age : ");
				int age=Integer.parseInt(br.readLine());
				
				ps.setString(1, name);
				ps.setInt(2, age);
				ps.execute();
				if(i==2) {
					con.rollback();
				}
				if(i==5) {
					con.commit();
				}
			}
			ps.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
