package programs;

import java.io.*;

class ExDemo
{
	public void abc() throws ArithmeticException, NullPointerException, IOException, UserException
	{
		int a =50;
		for(int i=0;i<=20;i++) {
			System.out.println(i);
			int res= a/(a-i);
			if(i==30)
				throw new NullPointerException();
			if(i==12)
				throw new IOException();
			if(i==100)
				return;
			if(i==8)
				throw new UserException("When i was 8");
			if(i==60)
				throw new UserException("When i was 6");
		}
	}
	public void xyz() throws ArithmeticException, NullPointerException, IOException, UserException
	{
		abc();
	}
	public void atoz() throws ArithmeticException, NullPointerException, IOException, UserException
	{
		xyz();
	}
}

public class ExceptionDemo {
	public static void main(String args[]) {
		
		try
		{
			ExDemo a1 = new ExDemo();
			a1.atoz();
		}
		catch(IOException e)
		{
			System.out.println("IOException Handler");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException Handler");
		}
		catch(UserException e)
		{
			System.out.println("UserException Handler");
			System.out.println("Reason: "+e.getMessage());
			e.display();
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Default Exception Handler");
		}
		
		finally
		{
			System.out.println("Thank You! This is finally block.");
		}
		System.out.println("Program continues....");
		System.out.println("Main Exit");
	}
}

//custom exception
class UserException extends Exception  //RuntimeException
{
	int x;
	
	//these two constructors are compulsory
	public UserException() {
		super();
	}
	//used to show reason of exception
	public UserException(String msg) {
		super(msg);
	}
	public void display() {
		System.out.println("Display method in custom exception.");
	}
}