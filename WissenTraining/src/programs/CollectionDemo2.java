package programs;

import java.util.*;

class AddingElements<T>{
	public void add(T a, T b) {
		System.out.println("Addition of some type");
	}
}
public class CollectionDemo2 {
	public static void main(String args[]) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("hello");
		list.add(45678);
		list.add(new Thread());
		list.add(4534.43);
		list.add(new Date());
		
		System.out.println(list);
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(111, "Aditya");
		map.put(222, "rohit");
		map.put(333, "raj");
		System.out.println(map);
		
		AddingElements<Integer> obj1=new AddingElements<Integer>();
		obj1.add(111,222);
		
		AddingElements<String> obj2=new AddingElements<String>();
		obj2.add("rohit","raj");
		
		AddingElements<Boolean> obj3=new AddingElements<Boolean>();
		obj3.add(true,false);
	}
}
