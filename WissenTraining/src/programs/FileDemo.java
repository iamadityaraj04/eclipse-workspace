package programs;

import java.io.*;
public class FileDemo {
	public static void main(String args[]) {
		try
		{
			File dir1=new File("abc");
			dir1.mkdir();
			
			//creating a folder xyz in abc folder
			File dir2=new File(dir1,"xyz");
			dir2.mkdir();
			
			//creating txt file in xyz folder
			File f=new File(dir2,"newFile.txt");
			f.createNewFile();
			
			PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
			pw.println(args[0]);
			pw.flush();
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
