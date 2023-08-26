package programs;

import java.sql.*;
import java.io.*;
public class Jdbc3 {
	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			PreparedStatement ps=connect.prepareStatement("insert into emp values(?,?);");
			
			System.out.println("Enter Name: ");
			String name=br.readLine();
			System.out.println("Enter Age: ");
			int age=Integer.parseInt(br.readLine());
			ps.setString(1, name);
			ps.setInt(2, age);
			
			ps.execute();
			ps.close();
			connect.close();
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
