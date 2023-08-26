package programs;

import java.util.*;
public class CollectionDemo1 {
	public static void main(String args[]) {
		//HashSet obj =new HashSet();
		//TreeSet obj =new TreeSet();
		LinkedHashSet obj =new LinkedHashSet();
		//Vector obj =new Vector();
		//ArrayList obj =new ArrayList();
		//LinkedList obj =new LinkedList();
		
		//PriorityQueue obj=new PriorityQueue();
		
		obj.add("5");
		obj.add("3");
		obj.add("4");
		obj.add("9");
		obj.add("8");
		obj.add("7");
		obj.add("7");
		
		Iterator it=obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
