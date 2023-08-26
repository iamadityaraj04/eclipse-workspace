package programs;

import java.sql.*;
public class Jdbc1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root1234");
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery("select * from emp");
            
            // just like iterator but here next() for both checking and iterating
            while (resultSet.next()) {
                System.out.println("Name: "+resultSet.getString(1));
                System.out.println("Age: "+resultSet.getInt(2));
                System.out.println("---------------");
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}