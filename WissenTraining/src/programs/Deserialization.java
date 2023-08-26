package programs;

import java.io.*;
public class Deserialization {
	public static void main(String args[])
	{
		try
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.txt"));
			Person p1=(Person) ois.readObject();
			System.out.println("Name: "+p1.name);
			System.out.println("Age: "+p1.age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
