package programs;

import java.io.*;
public class Serialization {
	public static void main(String args[]) {
		try
		{
			Person p1=new Person();
			p1.name="Rohit";
			p1.age=24;
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.txt"));
			oos.writeObject(p1);
			oos.close();
			
			System.out.println("Serialized successfully.....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
