package programs;

import java.io.*;
public class IODemo3 {
	public static void main(String args[]) {
		try
		{
			//only read operation is allowed
			//RandomAccessFile raf=new RandomAccessFile("abc.txt","r");
			
			//both read and write operation is allowed
			RandomAccessFile raf=new RandomAccessFile("abc.txt","rw");
			
			//raf.seek(5);//will skip/jump '5' character
			//System.out.println(raf.readLine());
			System.out.println(raf.length());
			raf.seek(raf.length());
			raf.writeBytes("This is written by RandomAccessFile Class");//writes data
			raf.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
