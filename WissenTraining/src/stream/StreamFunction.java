package stream;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamFunction {
	
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(78);
		list.add(98);
		list.add(8);
		list.add(28);
		list.add(45);
		list.add(8);
		list.add(78);
		list.add(88);
		list.add(99);
		list.add(45);
		
		//filter the list and prints odd number
		List<Integer> filteredList1=list.stream().filter(x->x%2==1).collect(Collectors.toList());
		//filter the list and prints number < 50
		List<Integer> filteredList2=list.stream().filter(x->x<50).collect(Collectors.toList());
		
		System.out.print("List: "+list+"\n");
		System.out.print("FilteredList1: "+filteredList1+"\n");
		System.out.print("FilteredList2: "+filteredList2+"\n");
		
		//counts the length of the 
		Long listLength=list.stream().count();
		System.out.print("Length of List: "+listLength+"\n");
		Long filteredListLength=filteredList1.stream().count();
		System.out.print("Length of FilteredList1: "+filteredListLength+"\n");
		
		//eliminates the repeated value
		List<Integer> distinctValue=list.stream().distinct().collect(Collectors.toList());
		System.out.print("DistinctValue: "+distinctValue+"\n");
		
		//performs action for each element of stream
		distinctValue.stream().forEach(System.out::println);
		
		//sort the list 
		List<Integer> sortedListAsc=list.stream().sorted().collect(Collectors.toList());
		System.out.print("Sorted List Increasing: "+sortedListAsc+"\n");
		List<Integer> sortedListDsc=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.print("Sorted List Decreasing: "+sortedListDsc+"\n");
		
		//returns whether all elements of stream matches the given condition
		boolean result1=list.stream().allMatch(a->a>5);
		System.out.print("All element are greater than 0: "+result1+"\n");
		boolean result2=list.stream().allMatch(a->a%2==0);
		System.out.print("All element are even: "+result2+"\n");
		
		//returns whether any elements of stream matches the given condition
		boolean result3=list.stream().anyMatch(a->a>100);
		System.out.print("Any element is greater than 100: "+result3+"\n");
		boolean result4=list.stream().anyMatch(a->a%2==0);
		System.out.print("Any element is even: "+result4+"\n");
		
		/* returns first element present in the list
		if there is null then it will give null pointer exception */
		List<Integer> newList=new ArrayList<>();
		Optional<Integer> firstElement=newList.stream().findFirst();
		if(firstElement.isPresent()) {
			System.out.print("First Element is: "+firstElement+"\n");
		}else {
			System.out.print("no value"+"\n");
		}
		
		/* returns any element present in the list or empty if the list is empty
		if there is null then it will give null pointer exception */
		Optional<Integer> findAny=newList.stream().findAny();
		System.out.print(findAny +"\n");
		
		//return the stream consisting of element not longer than the maxSize 
		List<Integer> limit=list.stream().limit(3).collect(Collectors.toList());
		System.out.print("Limit List: "+limit+"\n");
		
		//returns the maximum element of the stream based on Comparator
		Integer maxValue=list.stream().max(Integer::compare).get();
		System.out.print("Max Value: "+maxValue+"\n");
		
		//returns the minimum element of the stream based on Comparator
		Integer minValue=list.stream().min(Integer::compare).get();
		//Integer minValue=list.stream().max(Comparator.reverseOrder()).get();

		System.out.print("Man Value: "+minValue+"\n");
		
		//return the stream the remaining element after skipping n elements
		List<Integer> skip=list.stream().skip(3).collect(Collectors.toList());
		System.out.print("Result after skipping : "+skip+"\n");
		
		//return a builder for stream
		Stream.Builder<String> builder = Stream.builder();
	    //adding elements in the stream of Strings
	    Stream<String> stream = builder.add("Hi!").add("How").add("are").add("you?").build();
	    stream.forEach(System.out::println);
	}
}
