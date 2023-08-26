package programs;

import java.io.*;
import java.util.*;
public class FileDemo1 {
	public static void main(String args[]) {
		try
		{
			File f=new File("abc.txt");
			
			//find number of charachter in file
			System.out.println("File Length: "+f.length());
			
			//return whether it is file
			System.out.println("Is a file?: "+f.isFile());
			
			//return whether it is a directory
			System.out.println("Is a directory: "+f.isDirectory());
			
			//return last modified time in milliseconds that's date is used
			System.out.println("LastModified Time "+new Date(f.lastModified()));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
