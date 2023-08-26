package programs;

import java.util.*;
public class AlgorithmDemo {
	public static void main (String args[]) {
		LinkedList list = new LinkedList();
		
		list.add("666");
		list.add("111");
		list.add("666");
		list.addFirst("555");
		list.add("324");
		list.add("657");
		list.addLast("973");
		
//		Collections.sort(list);
//		Collections.shuffle(list);
		Collections.swap(list,3, 2);
		Collections.reverse(list);
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
