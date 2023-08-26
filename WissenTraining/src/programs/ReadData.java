package programs;

import java.io.*;

public class ReadData {
	public static void main(String args[]) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Your Name: ");
			String name=br.readLine();
			
			System.out.print("Enter Your Age: ");
			int age=Integer.parseInt(br.readLine());
			
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
