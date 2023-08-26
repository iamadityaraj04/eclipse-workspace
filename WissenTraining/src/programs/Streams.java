package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class NewEmployee{
	int id;
	String name;
	String designation;
	String department;

	public NewEmployee(int id, String name, String designation, String department) {
		this.id =id;
		this.name=name;
		this.designation=designation;
		this.department=department;
	}
	
	@Override
	public String toString() {
		return "[Id: "+id+", Name: "+name+", Designation: "+designation+", Department: "+department+"]\n";
	}
}
public class Streams {
	public static void main(String[] args) {
		
		/*
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77);
		System.out.println("Origin List: "+list);
		System.out.println();
		//filter odd number from list
		List<Integer> filteredList=list.stream().filter(x->x%2==1).collect(Collectors.toList());
		System.out.println("FilteredList: "+filteredList);
		System.out.println();
		
		
	
		//predicate
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77);
		Predicate<Integer> p=x->x%2==0;
		List<Integer> predicateList=list.stream().filter(p).collect(Collectors.toList());
		System.out.println("PredicateList: "+predicateList);
		System.out.println();
		
		
		
		
		//map
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77);
		System.out.println("List before updating: "+list);
		List<Integer> mapList=list.stream().map(x->x*2).collect(Collectors.toList());
		System.out.println("List after updating: "+mapList);
		System.out.println();
		
		
		
		//limit and skip
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77);
		List<Integer> mapList=list.stream().limit(5).skip(2).map(x->x*2).collect(Collectors.toList());
		System.out.println("List: "+mapList);
		System.out.println();
		
		
		//reduce
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77);
		int sum=list.stream().reduce(5,(element1,element2)->element1 + element2);
		System.out.println("Sum: "+sum);
		System.out.println();
		
		
		
	
		//multiple list
		System.out.println("List of List...");
		List<Integer> list1=Arrays.asList(32,5,12,43,64,75,34);
		List<Integer> list2=Arrays.asList(132,15,112,143,164,175);
		
		List<List<Integer>> finalList=Arrays.asList(list1,list2);
		System.out.println(finalList);
		System.out.println();
		
		
		//merges more than one list to a single list to use stream methods
		System.out.println("Merging list using flatMap...");
		List<Integer> flatMapList1=finalList.stream().flatMap(data->data.stream()).collect(Collectors.toList());
		System.out.println(flatMapList1);
		System.out.println();

		//merging list and filtering it
		List<Integer> flatMapList2=finalList.stream().flatMap(data->data.stream().filter(x->x%2==0)).collect(Collectors.toList());
		System.out.println(flatMapList2);
		
		
		
	
		//count
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77);
		long count=list.stream().count();
		System.out.println("Count: "+count);
		
		
		
		//allMatch
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77);
		boolean result=list.stream().allMatch(x -> x>4);
		System.out.println("Result: "+result);
		
		
		
		//anyMatch
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77);
		boolean result=list.stream().anyMatch(x -> x%9==0);
		System.out.println("Result: "+result);
		
		
		
		
		//distinct
		List<Integer> list=Arrays.asList(32,5,12,43,64,75,77,32,8,5,64);
		List<Integer> distinct=list.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Elements: "+distinct);
	
		
		
		//Summary Statistics
		IntStream intStream=IntStream.of(32,5,12,43,64,75,77);
		
		IntSummaryStatistics sumStat=intStream.summaryStatistics();
		System.out.println("Summary Statistics");
		System.out.println(sumStat);
  		
  		
		
		//Builder
		Stream.Builder<String> builder=Stream.builder();
		Stream<String> stream= builder.add("Aditya").add("Shubham").add("Puneet").add("Rishav").build();
		
		stream.forEach(data->System.out.println(data));
		
		
		//concat
		Stream<String> stream1 = Stream.of("Aditya","Puneet","Pankaj","Shubham","Ranvijay");
        Stream<String> stream2 = Stream.of("Shweta", "Ridhima", "Drishti", "Priyanka");
		
		Stream.concat(stream1, stream2).forEach(element -> System.out.print(element +" "));
		
		
		
		//empty
		Stream<String> stream = Stream.empty();
		stream.forEach(element -> System.out.println(element));
		
		
		//findAny
		List<Integer> list=Arrays.asList(342,23	);
		
		Optional<Integer> result=list.stream().findAny();
		if(result.isPresent()) {
			System.out.println(result.get());
		}
		else {
			System.out.println("Empty Stream");
		}
		

		//findFirst
		List<String> list=Arrays.asList("Rohit","Shatyam"	);
		
		Optional<String> result=list.stream().findFirst();
		if(result.isPresent()) {
			System.out.println("First Element: "+result.get());
		}
		else {
			System.out.println("Empty Stream");
		}
		
		
		//flatMapToDeouble
		List<String> list = Arrays.asList("1.5", "2.7", "3", "4", "5.6");
		DoubleStream result=list.stream().flatMapToDouble(num -> DoubleStream.of(Double.parseDouble(num)));
		result.forEach(element -> System.out.println(element));
		
		
		
		
		//partitionBy
		Stream<Integer> stream=Stream.of(23,45,12,54,76,33,65,23,7,34,63,97);
		Map<Boolean, List<Integer>> partitionByData= stream.collect(Collectors.partitioningBy(x -> x>50));
		
		System.out.println("Partitioned Data: "+partitionByData);
		*/
		
		//groupingBy
		List<NewEmployee> empList=new ArrayList<NewEmployee>();
		empList.add(new NewEmployee(101,"Aditya Raj", "SDE","IT"));
		empList.add(new NewEmployee(102,"Tanya Raj", "Full Stack Developer","IT"));
		empList.add(new NewEmployee(103,"Prerna Yadav", "Full Stack Developer","IT"));
		empList.add(new NewEmployee(104,"Shivam Singh", "SDE","IT"));
		empList.add(new NewEmployee(105,"Himanshu", "Data Analyst","IT"));
		empList.add(new NewEmployee(106,"Tanvi", "Data Analyst","IT"));
		
		Map<String, List<NewEmployee>> groupByList=empList.stream().collect(Collectors.groupingBy(emp -> emp.designation));
		
		System.out.println(groupByList);
	}
}
