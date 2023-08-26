package programs;
import java.util.*;

//sorting using comparator
class NameSorter implements Comparator<Emp>
{
	public int compare (Emp e1, Emp e2) {
		return e1.name.compareTo(e2.name);
	}
}
class NameSorterDesc implements Comparator<Emp>
{
	public int compare (Emp e1, Emp e2) {
		return e2.name.compareTo(e1.name);
	}
}
class AgeSorter implements Comparator<Emp>
{
	public int compare (Emp e1, Emp e2) {
		Integer a1=e1.age;
		Integer a2=e2.age;
		return a1.compareTo(a2);
	}
}
class AgeSorterDesc implements Comparator<Emp>
{
	public int compare(Emp e1, Emp e2) {
		Integer a1=e1.age;
		Integer a2=e2.age;
		return a2.compareTo(a1);
	}
}
