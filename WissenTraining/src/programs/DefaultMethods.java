package programs;

import java.util.Arrays;
import java.util.List;

public class DefaultMethods{
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,23,49,56,32,95,24,51,84);
		
		System.out.println("Iterating without for each");
		for(int i: list) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Iterating with for each");
		list.forEach(data -> {if(data%2==0) {System.out.println(data);}});
	}
}


/*
interface Math1{
	default int sum(int num1, int num2) {
		return num1+num2;
	}
}

interface Math2{
	default int sum(int num1, int num2) {
		return (num1+num2)*3;
	}
}

public class DefaultMethods implements Math1,Math2{
	public static void main(String[] args) {
		DefaultMethods obj1=new DefaultMethods();
		System.out.println("Sum: "+obj1.sum(125, 23));	
	}
	public int sum(int num1, int num2) {
		return Math2.super.sum(num1, num2);
	}
}
*/



/*
interface Sumable{
	default int sum(int num1, int num2) {
		return num1+num2;
	}
}

public class DefaultMethods implements Sumable {
	public static void main(String[] args) {
		DefaultMethods obj1=new DefaultMethods();
		System.out.println("32 + 130 = "+obj1.sum(32, 130));
	}
}
*/
