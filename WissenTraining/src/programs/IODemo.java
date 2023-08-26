package programs;

import java.io.*;

public class IODemo {
	public static void main(String args[]) {
		try
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter file name: ");
			String fileName=br.readLine();
			
			File f=new File(fileName);
			
			if(f.exists()) //checks if file exists
			{
				BufferedReader fr=new BufferedReader(new FileReader(fileName));
				String line=null;
				while((line=fr.readLine()) !=null) //print till line == null
				{
					System.out.println(line);
				}
				fr.close();
			}
			else
			{
				System.out.println("File doesn't exists.");
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
