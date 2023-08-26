package programs;

import java.io.*;
public class IODemo2 {
	public static void main(String args[]) {
		try
		{
			//writing on console
			//PrintWriter pw=new PrintWriter(System.out);
			
			//writing in a file but it will replace the data of the file because
			//second parameter is by default false
			//PrintWriter pw= new PrintWriter(new FileOutputStream("abc.txt"));
			
			//append data without replacing previous one
			PrintWriter pw= new PrintWriter(new FileOutputStream("abc.txt",true));
			pw.println("Hello! How are you?");
			pw.flush();
			pw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
