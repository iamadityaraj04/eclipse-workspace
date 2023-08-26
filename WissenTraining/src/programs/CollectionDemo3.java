package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Emp{
	String name;
	int age;
	Emp(String n, int a){
		name=n;
		age=a;
	}
	public String toString() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		return "";
	}
}
public class CollectionDemo3 {
	public static void main (String args[]) {
		//TreeSet<Emp> obj=new TreeSet<Emp>(new AgeSorter());
		ArrayList<Emp> obj=new ArrayList<Emp>();
		
		obj.add(new Emp("Rohit", 34));
		obj.add(new Emp("Shubham", 44));
		obj.add(new Emp("Rahul", 24));
		obj.add(new Emp("Abhishek", 34));
		obj.add(new Emp("Payal", 25));
		obj.add(new Emp("Tanya", 41));
		
		Collections.sort(obj,new NameSorter());
		
		Iterator i=obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
