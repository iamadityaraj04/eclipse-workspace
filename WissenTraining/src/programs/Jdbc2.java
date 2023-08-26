package programs;

import java.sql.*;
public class Jdbc2 {
	public static void main(String[] args) {
		try
		{	
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employee";
			String root="root";
			String password="root1234";
			Connection con=DriverManager.getConnection(url,root,password);
			Statement st=con.createStatement();
			
			//st.executeUpdate("insert into emp values('Rahul', 30)");
			//st.executeUpdate("delete from emp where Name='Rahul';");
			st.executeUpdate("update emp set AGE=AGE+1");
			
			ResultSet rs=st.executeQuery("select * from emp;");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"---"+rs.getInt(2));
			}
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
