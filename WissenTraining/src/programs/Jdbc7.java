package programs;

import java.sql.*;
import java.util.*;
public class Jdbc7 {
	public static void main (String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root1234");
			Statement st=con.createStatement();
			
			System.out.print("Enter table name: ");
			String name=new Scanner(System.in).nextLine();
			ResultSet rs=st.executeQuery("select * from "+name);
			
			//to get data of tables like columnName, columnCount
			ResultSetMetaData rsm=rs.getMetaData();
			
			while(rs.next()) {
				for(int i=1;i<=rsm.getColumnCount();i++) {
					System.out.println(rsm.getColumnName(i)+": "+rs.getString(i));
				}
				System.out.println();
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
