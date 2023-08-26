package employee.assignment;

import java.util.*;

//classes to sort data
class DesignationSorter implements Comparator<Employee>
{
	public int compare (Employee e1, Employee e2) {
		String s1=e1.getDesignation();
		String s2=e2.getDesignation();
		return s1.compareTo(s2);
	}
}
class AgeSorter implements Comparator<Employee>
{
	public int compare (Employee e1, Employee e2) {
		Integer a1=e1.getAge();
		Integer a2=e2.getAge();
		return a1.compareTo(a2);
	}
}
class SalarySorter implements Comparator<Employee>
{
	public int compare (Employee e1, Employee e2) {
		Float a1=e1.getSalary();
		Float a2=e2.getSalary();
		return a1.compareTo(a2);
	}
}
class NameSorter implements Comparator<Employee>
{
	public int compare (Employee e1, Employee e2) {
		String a1=e1.getName();
		String a2=e2.getName();
		return a1.compareTo(a2);
	}
}