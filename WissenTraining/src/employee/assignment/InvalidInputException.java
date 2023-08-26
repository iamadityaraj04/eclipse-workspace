package employee.assignment;

import java.util.*;
import java.util.regex.*;
import java.io.*;

public class InvalidInputException extends Exception{
	public InvalidInputException() {
		
	}
	public InvalidInputException(String msg) {
		super(msg);
	}
	public static boolean validateLetters(String txt) {
	    String regx = "^[a-zA-Z\\s]*$";
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(txt);
	    return matcher.find();
	}
	public static String readName() {
		while(true) {
			try
			{
				System.out.print("Enter Name: ");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String name=br.readLine();
				//String name=new Scanner(System.in).nextLine();
				if(validateLetters(name)==false) {
					throw new InvalidInputException();
				}
				else
				{
					return name;
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("Invalid age! Age can only be number.");
			}
			catch(InvalidInputException ex)
			{
				System.out.println("Name can only contain letters.");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static int readAge() {
		while(true) {
			try
			{	
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter Age: ");
				int age=Integer.parseInt(br.readLine());
				//int age=new Scanner(System.in).nextInt();
				if(age<21 || age>60) {
					throw new InvalidInputException();
				}
				else
				{
					return age;
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("Invalid age! Age can only be number.");
			}
			catch(InvalidInputException ex)
			{
				System.out.println("Please enter age between 21 - 60");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static int readId() {
		while(true) {
			try
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter Id: ");
				int id=Math.abs(Integer.parseInt(br.readLine()));
				//int age=new Scanner(System.in).nextInt();
				return id;
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	public static int menuChoice() {
		Menu m=new Menu();
		while(true) {
			try
			{
				int ch=m.menu();
				if(ch<1 || ch>5) {
					throw new InvalidInputException();
				}
				return ch;
			}
			catch (InvalidInputException e) 
			{
				System.out.println("Invalid Input! Please Enter a valid choice.");
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Invalid Input! Please Enter a valid choice.");
			}
			catch(Exception e)
			{
				System.out.println("Unknown Exception");
			}
		}
	}
	public static int subMenuChoice() {
		Menu m=new Menu();
		while(true) {
			try
			{
				int ch=m.subMenu();
				if(ch<1 || ch>4) {
					throw new InvalidInputException();
				}
				return ch;
			}
			catch (InvalidInputException e) 
			{
				System.out.println("Invalid Input! Please Enter a valid choice.");
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Invalid Input! Please Enter a valid choice.");
			}
			catch(Exception e)
			{
				System.out.println("Unknown Exception");
			}
		}
	}
	public static int displayMenuChoice() {
		Menu m=new Menu();
		while(true) {
			try
			{
				int ch=m.displayMenu();
				if(ch<1 || ch>5) {
					throw new InvalidInputException();
				}
				return ch;
			}
			catch (InvalidInputException e) 
			{
				System.out.println("Invalid Input! Please Enter a valid choice.");
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Invalid Input! Please Enter a valid choice.");
			}
			catch(Exception e)
			{
				System.out.println("Unknown Exception");
			}
		}
	}
}